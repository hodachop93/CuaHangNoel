package model.bo;

import java.util.ArrayList;

import model.bean.DonHang;
import model.dao.CheckDonHangDAO;

public class CheckDonHangBO {
	CheckDonHangDAO checkDonHang = new CheckDonHangDAO();
	public ArrayList<DonHang> getDonHang() {
		return checkDonHang.getDonHang();
	}

}
