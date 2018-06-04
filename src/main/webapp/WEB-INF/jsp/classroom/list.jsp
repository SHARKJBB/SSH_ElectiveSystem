<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>

    <title>ClassRoom List</title>
    <link rel="stylesheet" href="../../../css/list.css">
</head>

<body>
<h1 align="center">教室信息列表</h1>
<hr>
<table align="center">
    <thead>
    <tr>
        <th>ID</th>
        <th>教室名称</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#classrooms">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="name"/></td>
            <td style="text-align: center">
                <a class="edit" href="classroom_updateInput?id=<s:property value='id'/>">修改</a>
                <a class="delete" href="classroom_delete?id=<s:property value='id'/>">删除</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
