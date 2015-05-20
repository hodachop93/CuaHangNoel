package model.bo;

import java.util.ArrayList;

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

		return checkDonHangDAO.isValidDonHang(userID, orderID,
				customerName, customerPhone, customerAddress, addressGift, timeGift,
				numberGift);
	}

}
