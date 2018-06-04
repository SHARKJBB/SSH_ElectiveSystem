<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>
    <title>ClassRoom Update</title>
    <link rel="stylesheet" type="text/css" href="../../../css/add.css">
</head>

<body>
<h1 align="center">教室信息修改</h1>
<hr>
<form action="classroom_update" method="post">
    <input type="hidden" name="id" value="<s:property value='id'/>">
    <table align="center" width="50%">
        <tr>
            <td class="label">教室名称&nbsp;:&nbsp;</td>
            <td><input type="text" name="name" value="<s:property value='name'/>"></td>
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
