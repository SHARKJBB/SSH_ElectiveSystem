<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE >
<html>
<head>
	
	<title>leftPage1</title>
	<link rel="stylesheet" type="text/css" href="../../css/left1.css">
	<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
	<link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css">
	<script type="text/javascript">
      $(function (){
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
	<h3 class="h1"><span>开始选课</span></h3>
	<ul>
		<li><a href="selectCourse_addInput" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;选课</a></li>
		<li><a href="selectCourse_list" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;退选</a></li>
	</ul>
	<h3 class="h2"><span>查看课表</span></h3>
	<ul>
		<li><a href="student_show" target="con"><i class="fa fa-angle-right" style="font-size:20px"></i>&nbsp;&nbsp;查看课表</a></li>
	</ul>
</div>
</body>
</html>
