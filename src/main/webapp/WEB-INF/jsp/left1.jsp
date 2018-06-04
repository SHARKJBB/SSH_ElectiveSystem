<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE>
<html>
<head>
    <title>leftPage1</title>
    <link rel="stylesheet" type="text/css" href="../../css/left1.css">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css">
    <script type="text/javascript">
      $(function () {
        $("h3").click(topic, topic);
        function topic() {
          $(this).next("ul").slideToggle(200);
          $(this).next("ul").siblings("ul").slideUp(200);
        }
      });
    </script>
</head>

<body>
<div>
    <h3 class="h1"><span>教师管理</span></h3>
    <ul>
        <li><a href="teacher_addInput" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;教师添加</a></li>
        <li><a href="teacher_list" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;教师列表</a></li>
    </ul>
    <h3 class="h2"><span>学生管理</span></h3>
    <ul>
        <li><a href="student_addInput" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;学生添加</a></li>
        <li><a href="student_list" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;学生列表</a></li>
    </ul>
    <h3 class="h3"><span>教室管理</span></h3>
    <ul>
        <li><a href="classroom_addInput" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;教室添加</a></li>
        <li><a href="classroom_list" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;教室列表</a></li>
    </ul>
    <h3 class="h4"><span>课程管理</span></h3>
    <ul>
        <li><a href="course_addInput" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;课程添加</a></li>
        <li><a href="course_list" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;课程列表</a></li>
    </ul>
    <h3 class="h6"><span>选课管理</span></h3>
    <ul>
        <li><a href="studentCourse_addInput" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;选课添加</a></li>
        <li><a href="studentCourse_list" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;选课列表</a></li>
    </ul>
    <h3 class="h5"><span>选课开关</span></h3>
    <ul>
        <li><a href="sw_list" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;开放/关闭选课</a></li>
    </ul>
</div>
</body>
</html>
