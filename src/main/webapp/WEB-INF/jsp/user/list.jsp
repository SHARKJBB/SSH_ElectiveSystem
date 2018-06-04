<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- 引入Struts的标签库 -->
<%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE >
<html>
  <head>

    <title>My JSP 'list.jsp' starting page</title>
	<link rel="stylesheet" href="../../../css/list.css">

  </head>
  
  <body>

    <h1 align="center">用户列表</h1>
    <hr>
	<table align="center">
		<thead>
		<tr>
			<th>ID</th>
			<th>用户名</th>
			<th>昵称</th>
		</tr>
		</thead>
		<tbody>
			<s:iterator value="#users">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="username"/> </td>
				<td><s:property value="nickname"/></td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
  </body>
</html>
