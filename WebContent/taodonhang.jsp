<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Tạo đơn hàng</title>
</head>
<body>
<center>
	<h1>Tạo mới đơn hàng</h1>
	<form action="CheckDonHangServlet" method="post" class="center" >
		<p>
			Mã khách hàng: &nbsp;&nbsp;   <input type="text" name="userID" placeholder="Mã khách hàng" required="required"> &nbsp; 
			<label text-color="red">(*)</label>
		</p>
		<p>
			Mã đơn hàng: &nbsp;&nbsp; <input type="text" name="orderID" placeholder="Mã đơn hàng" required="required"/> &nbsp; 
			<label text-color="red">(*)</label>
		</p>
		<p>
			Tên khách hàng: &nbsp;&nbsp; <input type="text" name="customerName" placeholder="Tên khách hàng" required="required"/> &nbsp; 
			<label text-color="red">(*)</label>
		</p>
		<p>
			Số điện thoại: &nbsp;&nbsp; <input type="text" name="customerPhone" placeholder="Số điện thoại" required="required"/> &nbsp; 
			<label text-color="red">(*)</label>
		</p>
		<p>
			Địa chỉ khách hàng: &nbsp;&nbsp; <input type="text" name="customerAddress" placeholder="Địa chỉ khách hàng" required="required"/> &nbsp; 
			<label text-color="red">(*)</label>
		</p>
		<p>
			Địa chỉ nhận quà: &nbsp;&nbsp; <input type="text" name="addressGift" placeholder="Địa chỉ nhận quà" required="required"/> &nbsp; 
			<label text-color="red">(*)</label>
		</p>
		<p>
			Thời gian nhận quà: &nbsp;&nbsp; <input type="text" name="timeGift" placeholder="Thời gian nhận quà" required="required"/> &nbsp; 
			<label text-color="red">(*)</label>
		</p>
		<p>
			Số lượng quà: &nbsp;&nbsp; <input type="text" name="numberGift" placeholder="Số lượng quà" required="required"/> &nbsp; 
			<label text-color="red">(*)</label>
		</p>

		<input type="submit" class="button" value="Tạo">
	</form>
</center>
	
	
</body>
</html>