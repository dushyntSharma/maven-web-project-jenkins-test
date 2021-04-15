<!DOCTYPE html>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="utility.DBConnection"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Virtual Class</title>
<link rel="stylesheet" type="text/css" href="./style.css" />
</head>
<style type="text/css">
h1 {
	color: white;
}

p {
	padding-left: 20px;
	padding-top: 25px;
}

a {
	text-decoration: blink;
	text-align: center;
	color: white;
}

tr, td {
	background-color: white;
	padding: 15px;
	text-align: center;
}
</style>

<body>


	<ul class="main-nav">
		<li class="active"><a href="contactus.html">Contact Us</a></li>
	</ul>
	<ul class="main-nav">
		<li class="active"><a href="aboutus.html">About Us</a></li>
	</ul>

	<ul class="main-nav">
		<li class="active"><a href="index.jsp">Logout</a></li>
	</ul>

	<div class="nav">
		<h1>Welcome to Virtual Classroom</h1>

		<p>
			<a href="GetMarksDetails?action=listcenters">Marks Details</a>
		</p>
				<p>
			<a href="videoclass.html">Reference Videos</a>
		</p>



	</div>
	<%
	Connection con = DBConnection.getConnection();
	PreparedStatement pt = null;
	ResultSet res = null;
	String sql = "select * from news";
	response.setContentType("text/html");

	try {
		pt = con.prepareStatement(sql);
		res = pt.executeQuery();
		PrintWriter pw = response.getWriter();
	%>

	<%

	%><table border='1'>
		<tr>
			<td>Topic</td>
			<td>Description</td>
			<td>Date</td>
		</tr>
		<%
		while (res.next()) {
		%>


		<tr>
			<td>
				<%
				pw.println(res.getString(1));
				%>
			</td>
			<td>
				<%
				res.getString(2);
				%>
			</td>
			<td>
				<%
				res.getDate(3);
				%>
			</td>
		</tr>



		<%
		}
		} catch (SQLException e) {

		e.printStackTrace();
		}
		%>
	</table>

	<div>
		<video controls="controls">
			<source src="video1.mp4" type="video/mp4">

		</video>

		<video controls="controls">
			<source src="D:\Script Workspace\ClassRoomWeb\video2.mp4"
				type="video/mp4">
		</video>
		<video controls="controls">
			<source src="D:\Script Workspace\ClassRoomWeb\video3.mp4"
				type="video/mp4">
		</video>
		<video controls="controls">
			<source src="D:\Script Workspace\ClassRoomWeb\video4.mp4"
				type="video/mp4">
		</video>
		<video controls="controls">
			<source src="D:\Script Workspace\ClassRoomWeb\video5.mp4"
				type="video/mp4">
		</video>




	</div>




</body>

</html>