package model.dao;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.*;

import model.bean.DonHang;

public class ConnectSQLServerDAO {
	public static String diaChiCuaHang = "125 Đặng Huy Trứ";
	String driverClassStr = "net.sourceforge.jtds.jdbc.Driver";
	String databaseName = "CuaHangNoel";
	String hostName = "HODACHOP";
	String strConnection = String.format(
			"jdbc:jtds:sqlserver://%s:1433/%s;instance=SQLEXPRESS", hostName,
			databaseName);
	Connection connection;
	Statement statement;
	ResultSet resultset;

	public ConnectSQLServerDAO() {
		try {
			Class.forName(driverClassStr);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void openConnection() {
		try {
			connection = DriverManager.getConnection(strConnection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		try {
			if (resultset != null && !resultset.isClosed())
				resultset.close();
			if (statement != null && !statement.isClosed())
				statement.close();
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private boolean isExistData(String sqlStr) {
		openConnection();
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery(sqlStr);
			if (resultset.next())
				return true;
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return false;
	}

	private void myExecuteUpdate(String sqlStr) {
		openConnection();
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sqlStr);
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection();
		}
	}

	public ArrayList<DonHang> getAllDonHang() {
		DonHang temp = null;
		ArrayList<DonHang> listDonHang = new ArrayList<DonHang>();
		openConnection();
		String sql = "SELECT MaDH, a.MaKH, TenKH, SoLuongQua, DiaChiNhanQua, ThoiGianNhanQua "
				+ "FROM DONHANG a, KHACHHANG b " + "WHERE a.MaKH = b.MaKH";
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				temp = new DonHang();
				temp.setMaDH(rs.getString("MaDH"));
				temp.setMaKH(rs.getString("MaKH"));
				temp.setTenKH(rs.getString("TenKH"));
				temp.setSoLuong(rs.getInt("SoLuongQua"));
				temp.setDCNhanQua(rs.getString("DiaChiNhanQua"));
				temp.setTGNhanQua(rs.getString("ThoiGianNhanQua"));
				listDonHang.add(temp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listDonHang;
	}

	public Boolean isValidDonHang(String userID, String orderID,
			String customerName, String customerPhone, String customerAddress,
			String addressGift, String timeGift, String numberGift,
			int soTienPhuThu, int mucPhi) {

		Boolean isValid;
		String sql;
		// Nhap khach hang
		// Kiem tra khach hang da co trong bang chua?

		sql = "SELECT MaKH FROM KHACHHANG WHERE MaKH = " + userID;
		if (!isExistData(sql)) {
			// Neu khong ton tai, nhap du lieu vao
			sql = String.format(
					"INSERT INTO KHACHHANG VALUES ('%s', N'%s', '%s', N'%s')",
					userID, customerName, customerPhone, customerAddress);
			myExecuteUpdate(sql);
		}

		// Nhap don hang
		// Kiem tra don hang da co trong bang hay chua?
		sql = "SELECT MaDH FROM DONHANG WHERE MaDH = " + orderID;
		if (isExistData(sql)) {
			// Don hang da co
			isValid = false;
		} else {
			// Don hang chua co, nhap vao
			isValid = true;
			DonHang donhang = new DonHang(orderID, userID, customerName,
					Integer.parseInt(numberGift), addressGift, timeGift);
			sql = String
					.format("INSERT INTO DONHANG VALUES ('%s', '%s', N'%s', '%s', %d, %d, %d)",
							donhang.getMaDH(), donhang.getMaKH(),
							donhang.getDCNhanQua(), donhang.getTGNhanQua(),
							soTienPhuThu, donhang.getSoLuong(), mucPhi);
			myExecuteUpdate(sql);
		}

		return isValid;

	}

}
