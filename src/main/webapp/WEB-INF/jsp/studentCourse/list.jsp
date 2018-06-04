<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>Teacher List</title>
    <link rel="stylesheet" href="../../../css/list.css">

</head>

<body>
<h1 align="center">选课信息列表</h1>
<hr>
<table align="center">
    <thead>
    <tr>
        <th>ID</th>
        <th>学生学号</th>
        <th>学生姓名</th>
        <th>学生性别</th>
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
    <s:iterator value="#studentCourses" status="i">
        <tr>
            <td><s:property value="#i.count"/></td>
            <td><s:property value="student.num"/></td>
            <td><s:property value="student.name"/></td>
            <td><s:property value="student.sex"/></td>
            <td><s:property value="course.name"/></td>
            <td><s:property value="course.credit"/></td>
            <td><s:property value="course.classHour"/></td>
            <td><s:property value="course.week"/></td>
            <td><s:property value="course.time"/></td>
            <td><s:property value="course.teacher.name"/></td>
            <td><s:property value="course.classroom.name"/></td>
            <td>
                <a class="delete" href="studentCourse_delete?id=<s:property value='id'/>">退选</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
