<%@page import="dao.EditValues"%>
<%@page import="model.Student"%>

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
	String name = request.getParameter("name");
	short age = (short) Integer.parseInt(request.getParameter("age"));
	String address = request.getParameter("address");
	String city = request.getParameter("city");
	String state = request.getParameter("state");
	String country = request.getParameter("country");
	int pincode = Integer.parseInt(request.getParameter("pincode"));
	String email = request.getParameter("email");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	Student s = new Student();

	s.setName(name);
	s.setAge(age);
	s.setAddress(address);
	s.setCity(city);
	s.setState(state);
	s.setCountry(country);
	s.setPincode(pincode);
	s.setEmail(email);
	s.setUsername(username);
	s.setPassword(password);

	EditValues edit = new EditValues();
	edit.editStudent(s);
	%>
	<script type="text/javascript">
		window.location.href = "http://localhost:5320/ClassRoomWeb/getstudentdetails.jsp"
	</script>

</body>
</html>