<%@page import="model.bean.DonHang"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Trang chủ</title>
</head>
<body>
	<img id="banner" alt="Banner" src="images/banner.jpg">
	<br>
	<form action="CheckDirectionServlet" method="post">
		<table id="t01">
			<tr>
				<td align="center">
					<input type="submit" class="button"	value="Tạo đơn hàng" name="button">
				</td>
				<td align="center">
					<input type="submit" class="button"	value="Sửa đơn hàng" name="button">
				</td>
				<td align="center">
					<input type="submit" class="button" value="Xóa đơn hàng" name="button">
				</td>
			</tr>
		</table>
	</form>
	<br>
	<table class="donHang">
		<tr>
			<th>Mã đơn hàng</th>
			<th>Mã khách hàng</th>
			<th>Tên khách hàng</th>
			<th>Số lượng</th>
			<th>Địa chỉ nhân quà</th>
			<th>Thời gian nhận quà</th>
		</tr>
		<% 
			ArrayList<DonHang> listDH = (ArrayList<DonHang>) request.getAttribute("ListDonHang"); 
			for (int i = 0; i < listDH.size(); i++) {
		%>
		<tr>
			<td><%= listDH.get(i).getMaDH() %></td>
			<td><%= listDH.get(i).getMaKH() %></td>
			<td><%= listDH.get(i).getTenKH() %></td>
			<td><%= listDH.get(i).getSoLuong() %></td>
			<td><%= listDH.get(i).getDCNhanQua() %></td>
			<td><%= listDH.get(i).getTGNhanQua() %></td>
			
		</tr>
		
		<% } %>
	</table>

</body>
</html>