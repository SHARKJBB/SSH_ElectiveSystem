<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>
    <title>Teacher List</title>
    <link rel="stylesheet" href="../../../css/list.css">

</head>

<body>
<h1 align="center">教师信息列表</h1>
<hr>
<table align="center">
    <thead>
    <tr>
        <th>ID</th>
        <th>教师工号</th>
        <th>教师姓名</th>
        <th>所属院系</th>
        <th>联系邮箱</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#teachers" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="username"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="major"/></td>
            <td><s:property value="email"/></td>
            <td>
                <a class="edit" href="teacher_updateInput?id=<s:property value='id'/>">修改</a>
                <a class="delete" href="teacher_delete?id=<s:property value='id'/>">删除</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
