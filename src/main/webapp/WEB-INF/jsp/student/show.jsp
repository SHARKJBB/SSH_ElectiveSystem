<%@ page import="selectCourse.jz2.pojo.StudentCourse" %>
<%@ page import="java.util.ArrayList" %>
<!-- created at 2018/5/30 by BlueSky @xkSSH -->
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE >
<html>
<head>

	<title>Teacher Update</title>
	<style>
		body {
			background-color: rgb(248, 248, 248);
			font: 20px Georgia, "Times New Roman", Times, serif;
			color: #333;
			text-shadow: 1px 1px 1px #FFF;
			border: 0px solid #E4E4E4;
		}
		table {
			margin: 0 auto;
			margin-top: 5%;
			font-family: verdana,arial,sans-serif;
			font-size:20px;
			color:#333333;
			border-width: 1px;
			border-color: #666666;
			border-collapse: collapse;
		}
		table th {
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #666666;
			background-color: #dedede;
		}
		table td {
			width: 120px;
			height: 40px;
			text-align: center;
			border-width: 1px;
			padding: 8px;
			border-style: solid;
			border-color: #666666;
			background-color: #ffffff;
		}
	</style>

</head>

<head>
	<title>课表</title>
</head>
<body>
<table id="table">
	<tr>
		<th>节次</th>
		<th>星期一</th>
		<th>星期二</th>
		<th>星期三</th>
		<th>星期四</th>
		<th>星期五</th>
	</tr>
</table>
<script>
  $ = document.querySelector.bind(document);
  data = [<%
		ArrayList<StudentCourse> studentCourses = (ArrayList<StudentCourse>)session.getAttribute("studentCourses");
		for (StudentCourse course : studentCourses) {
			out.print("{ name: \'" + course.getCourse().getName() + "\',");
			out.print(" week: \'" + course.getCourse().getWeek() + "\',");
			out.print(" time: \'" + course.getCourse().getTime() + "\',");
			out.print(" teacher: \'" + course.getCourse().getTeacher().getName() + "\',");
			out.print(" classroom: \'" + course.getCourse().getClassroom().getName() + "\' },");
		}
	%>];
  final_data = [[], [], [], [], [], [], []];
  
  function convertData() {
    for (i = 0; i < data.length; i++) {
      c = data[i];
      if (final_data[c.week][c.time] === undefined) {
        final_data[c.week][c.time] = c.name + '<br>' + c.teacher + '<br>' + c.classroom;
        final_data[c.week][parseInt(c.time) + 1] = c.name + '<br>' + c.teacher + '<br>' + c.classroom;
      }
    }
  }
  
  function render() {
    for (i = 1; i <= 10; i++) {
      line = '<tr id="' + i + '"><td>' + i + '</td>';
      for (j = 1; j <= 5; j++) {
        if (final_data[j][i] !== undefined) {
          line += '<td>' + final_data[j][i] + '</td>';
        } else {
          line += '<td></td>';
        }
      }
      line += '</tr>';
      $('#table').innerHTML += line;
    }
  }
  
  convertData();
  render();
</script>
</body>
</html>
