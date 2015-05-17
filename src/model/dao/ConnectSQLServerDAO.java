package model.dao;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.*;

import model.bean.DonHang;

public class ConnectSQLServerDAO {
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

	public boolean isExistData(String sqlStr) {
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

	

	public ArrayList<DonHang> getAllDonHang() {
		DonHang temp = null;
		ArrayList<DonHang> listDonHang = new ArrayList<DonHang>();
		openConnection();
		String sql = "SELECT MaDH, a.MaKH, TenKH, SoLuongQua, DiaChiNhanQua, ThoiGianNhanQua "
				+ "FROM DONHANG a, KHACHHANG b "
				+ "WHERE a.MaKH = b.MaKH";
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
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		return listDonHang;
	}

}
