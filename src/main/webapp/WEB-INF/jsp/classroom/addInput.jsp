<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>

<!DOCTYPE >
<html>
<head>
    <title>ClassRoom Add</title>
    <link rel="stylesheet" href="../../../css/add.css">
</head>

<body>
<h1 align="center">教室信息添加</h1>
<hr/>
<form action="classroom_add" method="post">
    <table align="center" width="700">
        <tr>
            <td class="label">教室名称&nbsp;:&nbsp;</td>
            <td><input type="text" name="name"></td>
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
