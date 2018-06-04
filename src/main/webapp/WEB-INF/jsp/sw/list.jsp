<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Teacher List</title>
    <link rel="stylesheet" href="../../../css/list.css">
    <style type="text/css">
        table td{
            text-align: center;
        }
    </style>

</head>

<body>
<h1 align="center">开放/关闭选课</h1>
<hr>
<table align="center" width="30%">
    <thead>
    <tr>
        <th>当前状态</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="#sw" status="i">
        <tr>
            <td id="sw"></td>
            <script>
                document.getElementById("sw").innerText = <s:property value="flag"/> ? "开放" : "关闭"
            </script>
            <td>
                <a class="edit" href="sw_update?id=<s:property value='id'/>">修改</a>
            </td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
