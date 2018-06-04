<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>
	<title>Student Add</title>
	<link rel="stylesheet" href="../../../css/add.css">
	<style>
		table {
			margin: 0 auto;
			width: max-content;
		}
		
		td {
			text-align: center;
		}
		
		label {
			text-align: right;
		}
		
		.tdLabel {
			font-size: 20px;
			text-align: right;
			color: #333;
			padding-right: 18px;
		}
		
		.tdInput {
			width: 200px;
		}
		
		select {
			border: 1px solid #DADADA;
			color: #888;
			height: 30px;
			margin-bottom: 16px;
			margin-right: 6px;
			margin-top: 2px;
			outline: 0 none;
			padding: 3px 3px 3px 5px;
			width: 70%;
			font-size: 12px;
			line-height: 15px;
			box-shadow: inset 0px 1px 4px #ECECEC;
			-moz-box-shadow: inset 0px 1px 4px #ECECEC;
			-webkit-box-shadow: inset 0px 1px 4px #ECECEC;
		}
	</style>

</head>

<body>
<h1 align="center">选课信息添加</h1>
<hr>
<form action="studentCourse_add" method="post">
	<table align="center" style="display: <% out.print((boolean) session.getAttribute("isOpen") ? "block" : "none");%>;" width="50%">
		<tr>
			<td class="label">
				<s:select list="students" label="学生 "
				          listKey="id" listValue="name" name="student.id"/>
			</td>
		</tr>
		<tr>
			<td class="label">
				<s:select list="courses" label="课程 "
				          listKey="id" listValue="name" name="course.id"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="提交">
			</td>
		</tr>
	</table>
	<h4 style="color: red; text-align: center; display: <% out.print(!(boolean) session.getAttribute("isOpen") ? "block" : "none");%>;">
		当前未开放选课
	</h4>
</form>
</body>
</html>
