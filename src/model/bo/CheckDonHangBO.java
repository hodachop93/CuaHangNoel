package model.bo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import model.bean.DonHang;
import model.dao.CheckDonHangDAO;

public class CheckDonHangBO {
	CheckDonHangDAO checkDonHangDAO = new CheckDonHangDAO();

	public ArrayList<DonHang> getDonHang() {
		return checkDonHangDAO.getDonHang();
	}

	public Boolean isValidDonHang(String userID, String orderID,
			String customerName, String customerPhone, String customerAddress,
			String addressGift, String timeGift, String numberGift) {
		int soTienPhuThu = 0, mucPhi = 0;
		int price = 0;
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		Date thoiGianNhanQua = null;
		try {
			thoiGianNhanQua = dateFormat.parse(timeGift);
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		if ((thoiGianNhanQua.getDate() == 24) && (thoiGianNhanQua.getHours() > 18)){
			price = 50000;
		} else {
			price = 75000;
		}
		
		mucPhi = Integer.parseInt(numberGift) * price;
		soTienPhuThu  = 100000;

		return checkDonHangDAO.isValidDonHang(userID, orderID, customerName,
				customerPhone, customerAddress, addressGift, timeGift,
				numberGift, soTienPhuThu, mucPhi);
	}

}
