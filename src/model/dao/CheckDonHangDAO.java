package model.dao;

import java.util.ArrayList;

import model.bean.DonHang;

public class CheckDonHangDAO {
	ConnectSQLServerDAO connnectSQLServerDAO = new ConnectSQLServerDAO();
	public ArrayList<DonHang> getDonHang() {
		return connnectSQLServerDAO.getAllDonHang();
	}
	public Boolean isValidDonHang(String userID, String orderID,
			String customerName, String customerPhone, String customerAddress,
			String addressGift, String timeGift, String numberGift, int soTienPhuThu, int mucPhi) {

		return connnectSQLServerDAO.isValidDonHang(userID, orderID,
				customerName, customerPhone, customerAddress, addressGift, timeGift,
				numberGift, soTienPhuThu, mucPhi);
	}

}
