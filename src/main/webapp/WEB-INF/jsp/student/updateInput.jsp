<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>

    <title>Student Update</title>
    <link rel="stylesheet" type="text/css" href="../../../css/add.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
</head>

<body>
<h1 align="center">学生信息修改</h1>
<hr>
<form action="student_update" method="post">
    <input type="hidden" name="id" value="<s:property value='id'/>">
    <input type="hidden" name="password" value="<s:property value='password'/>">
    <table align="center" width="50%">
        <tr>
            <td class="label">学生学号&nbsp;:&nbsp;</td>
            <td><input type="text" name="num" disabled="disabled"
                       value="<s:property value='num'/>">
                <input type="hidden" name="num" value="<s:property value='num'/>">
            </td>
        </tr>
        <tr>
            <td class="label">学生姓名&nbsp;:&nbsp;</td>
            <td><input type="text" name="name"
                       value="<s:property value='name'/>">
            </td>
        </tr>
        <tr>
            <td class="label">学生性别&nbsp;:&nbsp;</td>
            <td><select type="text" name="sex">
                <option value="男" selected="selected">男</option>
                <option value="女">女</option>
            </select>
            </td>
        </tr>
        <tr>
            <td class="label">新密码&nbsp;:&nbsp;</td>
            <td><input type="text" name="password" placeholder="888888">
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
