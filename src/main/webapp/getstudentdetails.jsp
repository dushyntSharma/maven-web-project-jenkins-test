<%@page import="java.util.Iterator"%>
<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@page import="dao.GetStudents"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Student Details</title>
<link rel="stylesheet" type="text/css" href="./style.css" />
<style>
body {
	display: inline-block;
	margin-left: 20%;
	margin-right: 25%;
	width: 50%;
}

tr, td {
	background-color: white;
	padding: 10px;
	text-align: left;
}
</style>
</head>
<body>
	<hr>
	<%
	GetStudents s = new GetStudents();
	List<Student> s1 = s.getStudent();
	Iterator<Student> it = s1.iterator();
	%>
	<table border="1">

		<%
		while (it.hasNext()) {
			Student obj = new Student();
			obj = it.next();
		%>
		<tr>
			<td><%=obj.getName()%></td>
			<td><%=obj.getAge()%></td>
			<td><%=obj.getAddress()%></td>
			<td><%=obj.getCity()%></td>
			<td><%=obj.getState()%></td>
			<td><%=obj.getCountry()%></td>
			<td><%=obj.getPincode()%></td>
			<td><%=obj.getEmail()%></td>
			<td><%=obj.getUsername()%></td>
			<td><%=obj.getPassword()%></td>
			<td><a href="editstudent2.jsp?email=<%=obj.getEmail()%>">Edit</a></td>
			<td><a href="deletestudent.jsp?email=<%=obj.getEmail()%>">Delete</a></td>

		</tr>
		<%
		}
		%>
	</table>
	<div>
		<a href="adminHome.html">Back</a>
	</div>


</body>
</html>