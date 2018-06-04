<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>Course Update</title>
    <link rel="stylesheet" type="text/css" href="../../../css/add.css">
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
<h1 align="center">课程信息修改</h1>
<hr>
<form action="course_update" method="post">
    <input type="hidden" name="id" value="<s:property value='id'/>">
    <table align="center" width="50%">
        <tr>
            <td class="label">课程名称&nbsp;:&nbsp;</td>
            <td><input type="text" name="name" value="<s:property value='name'/>">
            </td>
        </tr>
        <tr>
            <td class="label">课程学分&nbsp;:&nbsp;</td>
            <td><input type="text" name="credit" value="<s:property value='credit'/>"></td>
        </tr>
        <tr>
            <td class="label">课程学时&nbsp;:&nbsp;</td>
            <td><input type="text" name="classHour" value="<s:property value='classHour'/>"></td>
        </tr>
        <tr>
            <td class="label">课程天次&nbsp;:&nbsp;</td>
            <td><input type="text" name="week" value="<s:property value='week'/>"></td>
        </tr>
        <tr>
            <td class="label">课程节次&nbsp;:&nbsp;</td>
            <td><input type="text" name="time" value="<s:property value='time'/>"></td>
        </tr>
        <tr>
            <td colspan="2">
                <s:select list="teachers" label="任课老师"
                          listKey="id" listValue="name" name="teacher.id"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <s:select list="classrooms" label="上课教室"
                          listKey="id" listValue="name" name="classroom.id"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="修改">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
