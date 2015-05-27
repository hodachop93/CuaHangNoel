package model.bean;

public class DonHang {
	private String maDH;
	private String maKH;
	private String tenKH;
	private int soLuong;
	private String DCNhanQua;
	private String TGNhanQua;
	
	public DonHang() {
		super();
	}
	public DonHang(String maDH, String maKH, String tenKH, int soLuong,
			String dCNhanQua, String tGNhanQua) {
		super();
		this.maDH = maDH;
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.soLuong = soLuong;
		DCNhanQua = dCNhanQua;
		TGNhanQua = tGNhanQua;
	}
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
