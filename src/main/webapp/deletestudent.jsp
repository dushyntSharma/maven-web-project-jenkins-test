<%@page import="dao.DeleteStudents"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String email = request.getParameter("email");
	DeleteStudents delete = new DeleteStudents();
	delete.deleteStudent(email);
	%>
	<script type="text/javascript">
		window.location.href = "http://localhost:5320/ClassRoomWeb/getstudentdetails.jsp"
	</script>
</body>
</html>