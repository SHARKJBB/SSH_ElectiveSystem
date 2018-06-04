<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE >
<html>
<head>

    <title>Teacher Update</title>
    <link rel="stylesheet" type="text/css" href="../../../css/add.css">

</head>

<body>
<h1 align="center">教师信息修改</h1>
<hr>
<form action="teacher_update" method="post">
    <input type="hidden" name="id" value="<s:property value='id'/>">
    <input type="hidden" name="password" value="<s:property value='password'/>">
    <table align="center" width="50%">
        <tr>
            <td class="label">教师工号&nbsp;:&nbsp;</td>
            <td><input type="text" name="username" disabled="disabled"
                       value="<s:property value='username'/>">
                <input type="hidden" name="username" value="<s:property value='username'/>">
            </td>
        </tr>
        <tr>
            <td class="label">教师姓名&nbsp;:&nbsp;</td>
            <td><input type="text" name="name" disabled="disabled" value="<s:property value='name'/>">
                <input type="hidden" name="name" value="<s:property value='name'/>">
            </td>
        </tr>
        <tr>
            <td class="label">所属院系&nbsp;:&nbsp;</td>
            <td><input type="text" name="major" value="<s:property value='major'/>"></td>
        </tr>
        <tr>
            <td class="label">联系邮箱&nbsp;:&nbsp;</td>
            <td><input type="text" name="email" value="<s:property value='email'/>"></td>
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
