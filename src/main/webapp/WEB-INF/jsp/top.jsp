<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="selectCourse.jz2.pojo.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>
	
	<title>My JSP 'top.jsp' starting page</title>
	<link rel="stylesheet" type="text/css" href="../../css/top.css">
	<script src="https://cdn.bootcss.com/moment.js/2.19.4/moment.min.js"></script>
	<script type="text/javascript">
      setInterval("clock.innerHTML=moment().format('YYYY-MM-DD HH:mm:ss')", 1000);
	</script>
</head>

<body>
<div id="con">
	<div id="left">选课管理系统</div>
	<div id="mid">
		<span id="clock"></span>
		<br/>
		<span>
            欢迎
            <s:property value="#session['loginUser'].getNickname()"/>
            <s:property value="#session['loginTeacher'].getName()"/>
            <s:property value="#session['loginStudent'].getName()"/>
    		<a href="logout" target="_top">退出</a>
    	</span>
	</div>
</div>
</body>
</html>
