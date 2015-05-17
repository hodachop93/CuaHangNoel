package model.dao;

import java.util.ArrayList;

import model.bean.DonHang;

public class CheckDonHangDAO {
	ConnectSQLServerDAO connnectSQLServerDAO = new ConnectSQLServerDAO();
	public ArrayList<DonHang> getDonHang() {
		return connnectSQLServerDAO.getAllDonHang();
	}

}
