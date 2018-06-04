<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- created at 2018/5/30 by BlueSky @xkSSH -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	
	<title>Student Add</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="../../../css/list.css">
	
	<style>
		table {
			width: max-content;
			margin: auto;
		}
	</style>

</head>

<body>
<h1 align="center">学生选课</h1>
<hr>
<table align="center" style="display: <% out.print((boolean) session.getAttribute("isOpen") ? "block" : "none");%>;">
	<thead>
	<tr>
		<td>课程名称</td>
		<td>课程学分</td>
		<td>课程学时</td>
		<td>课程天次</td>
		<td>课程节次</td>
		<td>任课老师</td>
		<td>上课教室</td>
		<td>操作</td>
	</tr>
	</thead>
	<tbody>
	<s:iterator value="#courses" status="i">
		<tr>
			<td><s:property value="name"/></td>
			<td><s:property value="credit"/></td>
			<td><s:property value="classHour"/></td>
			<td><s:property value="week"/></td>
			<td><s:property value="time"/></td>
			<td><s:property value="teacher.name"/></td>
			<td><s:property value="classroom.name"/></td>
			<td>
				<a class="edit" href="selectCourse_add?id=<s:property value='id'/>">选课</a>
			</td>
		</tr>
	</s:iterator>
	</tbody>
</table>
<h4 style="color: red; text-align: center; display: <% out.print(!(boolean) session.getAttribute("isOpen") ? "block" : "none");%>;">
	当前未开放选课
</h4>
</body>
</html>
