<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

    <title>Teacher Add</title>
    <link rel="stylesheet" href="../../../css/add.css">

</head>

<body>
<h1 align="center">教师信息添加</h1>
<hr>
<form action="teacher_add" method="post">
    <table align="center" width="700">
        <tr>
            <td class="label">教师工号&nbsp;:&nbsp;</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td class="label">教师姓名&nbsp;:&nbsp;</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td class="label">所属院系&nbsp;:&nbsp;</td>
            <td><input type="text" name="major"></td>
        </tr>
        <tr>
            <td class="label">联系邮箱&nbsp;:&nbsp;</td>
            <td><input type="text" name="email"></td>
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
