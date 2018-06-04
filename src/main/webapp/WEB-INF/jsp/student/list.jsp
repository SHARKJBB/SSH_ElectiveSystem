<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>Student List</title>
    <link rel="stylesheet" href="../../../css/list.css">

</head>

<body>
<h1 align="center">学生信息列表</h1>
<hr>
<table align="center">
    <thead>
    <tr>
        <th>ID</th>
        <th>学生学号</th>
        <th>学生姓名</th>
        <th>学生性别</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#students" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="num"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="sex"/></td>
            <td>
                <a class="edit" href="student_updateInput?id=<s:property value='id'/>">修改</a>
                <a class="delete" href="student_delete?id=<s:property value='id'/>">删除</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
