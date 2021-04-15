<%@page import="dao.DeleteStaff"%>
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
	DeleteStaff delete = new DeleteStaff();
	delete.deleteStaff(email);
	%>
	<script type="text/javascript">
		window.location.href = "http://localhost:5320/ClassRoomWeb/getstaffdetails.jsp"
	</script>
</body>
</html>