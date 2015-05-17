package model.bean;

public class DonHang {
	private String maDH;
	private String maKH;
	private String tenKH;
	private int soLuong;
	private String DCNhanQua;
	private String TGNhanQua;
	public String getDCNhanQua() {
		return DCNhanQua;
	}
	public void setDCNhanQua(String dCNhanQua) {
		DCNhanQua = dCNhanQua;
	}
	public String getTGNhanQua() {
		return TGNhanQua;
	}
	public void setTGNhanQua(String tGNhanQua) {
		TGNhanQua = tGNhanQua;
	}
	public String getMaDH() {
		return maDH;
	}
	public void setMaDH(String maDH) {
		this.maDH = maDH;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	

}
