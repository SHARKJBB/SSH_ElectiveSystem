<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>Student Add</title>
    <link rel="stylesheet" href="../../../css/add.css">

</head>

<body>
<h1 align="center">学生信息添加</h1>
<hr>
<form action="student_add" method="post">
    <table align="center" width="700">
        <tr>
            <td class="label">学生学号&nbsp;:&nbsp;</td>
            <td><input type="text" name="num"></td>
        </tr>
        <tr>
            <td class="label">学生姓名&nbsp;:&nbsp;</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td class="label">学生性别&nbsp;:&nbsp;</td>
            <td><select type="text" name="sex">
                <option value="男" selected="selected">男</option>
                <option value="女">女</option>
            </select></td>
        </tr>
        <tr>
            <td class="label">密码&nbsp;:&nbsp;</td>
            <td><input type="text" name="password" placeholder="888888"></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
