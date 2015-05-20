<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Login</title>
</head>
<body>
	<div class="container">
		<div class="login">
			<h1>Login</h1>
			<form method="post" action="">
				<p>
					<label>
					Your email or username
					</label>
					<input type="text" name="username" value=""
						placeholder="Username or email" required="required">
				</p>
				<p>
					<label>
					Your password
					</label>
					<input type="password" name="password" value=""
						placeholder="Password" required="required">
				</p>
				<p class="submit">
					<input type="submit" name="btnSubmit" value="Login">
				</p>
			</form>
		</div>
	</div>
</body>
</html>