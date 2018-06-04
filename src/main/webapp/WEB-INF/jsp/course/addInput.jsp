<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE >
<html>
<head>
    <title>Course Add</title>
    <link rel="stylesheet" href="../../../css/add.css">
    <style>
        td.tdLabel{
            font-size: 20px;
            text-align: right;
            color: #333;
            padding-right: 8px;
        }
        select{
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
            line-height:15px;
            box-shadow: inset 0px 1px 4px #ECECEC;
            -moz-box-shadow: inset 0px 1px 4px #ECECEC;
            -webkit-box-shadow: inset 0px 1px 4px #ECECEC;
        }
    </style>
</head>

<body>
<h1 align="center">课程信息添加</h1>
<hr>
<form action="course_add" method="post">
    <table align="center" width="700">
        <tr>
            <td class="label">课程名称&nbsp;:&nbsp;</td>
            <td><input type="text" name="course.name"></td>
        </tr>
        <tr>
            <td class="label">课程学分&nbsp;:&nbsp;</td>
            <td><input type="text" name="course.credit"></td>
        </tr>
        <tr>
            <td class="label">课程学时&nbsp;:&nbsp;</td>
            <td><input type="text" name="course.classHour"></td>
        </tr>
        <tr>
            <td class="label">课程天次&nbsp;:&nbsp;</td>
            <td><input type="text" name="course.week"></td>
        </tr>
        <tr>
            <td class="label">课程节次&nbsp;:&nbsp;</td>
            <td><input type="text" name="course.time"></td>
        </tr>
        <tr>
            <td>
                <s:select list="teachers" label="任课老师   "
                          listKey="id" listValue="name" name="teacher.id"/>
            </td>
        </tr>
        <tr>
            <td>
                <s:select list="classrooms" label="上课教室   "
                          listKey="id" listValue="name" name="classroom.id"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button class="button" type="submit">提交</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
