<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>
    <title>Course List</title>
    <link rel="stylesheet" href="../../../css/list.css">
</head>

<body>
<h1 align="center">课程信息列表</h1>
<hr>
<table align="center" width="80%">
    <thead>
    <tr>
        <th>ID</th>
        <th>课程名称</th>
        <th>课程学分</th>
        <th>课程学时</th>
        <th>课程天次</th>
        <th>课程节次</th>
        <th>任课老师</th>
        <th>上课教室</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#courses">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="credit"/></td>
            <td><s:property value="classHour"/></td>
            <td><s:property value="week"/></td>
            <td><s:property value="time"/></td>
            <td><s:property value="teacher.name"/></td>
            <td><s:property value="classroom.name"/></td>
            <td>
                <a class="edit" href="course_updateInput?id=<s:property value='id'/>">修改</a>
                <a class="delete" href="course_delete?id=<s:property value='id'/>">删除</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
