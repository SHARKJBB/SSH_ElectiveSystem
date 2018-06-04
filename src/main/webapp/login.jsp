<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>
<head>
	<title>登陆页面</title>
	<link rel="stylesheet" href="css/base.css">
	<link rel="stylesheet" href="css/reg.css">
	<link rel="bookmark" type="image/x-icon" href="img/nlogo.png"/>
	<link rel="shortcut icon" href="img/nlogo.png">
	<link rel="icon" href="img/nlogo.png">
	<link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css">
</head>

<body>
<div class="wrap">
	<div class="wpn">
		<div class="form-data pos">
			<img src="img/logo11.png" class="head-logo">
			<div class="change-login">
				<p style="color: grey"><i class="fa fa-arrow-right"></i>提示：请正确输入用户名和密码进行登录！</p>
			</div>
			<form action="login" method="post">
				<div class="form1">
					<p class="p-input pos">
						<input type="text" id="num" name="username" placeholder="请输入用户名">
						<span class="tel-warn num-err hide"><em>账号或密码错误，请重新输入</em><i class="fa fa-close" style="font-size:20px"></i></span>
					</p>
					<p class="p-input pos">
						<input type="password" id="pass" name="password" placeholder="请输入密码">
						<span class="tel-warn pass-err hide"><em>账号或密码错误，请重新输入</em><i class="fa fa-close" style="font-size:20px"></i></span>
					</p>
				</div>
				<button type="submit" class="lang-btn off log-btn" disabled="disabled">登录</button>
			</form>
		</div>
	</div>
</div>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="js/login.js"></script>

</body>
</html>
