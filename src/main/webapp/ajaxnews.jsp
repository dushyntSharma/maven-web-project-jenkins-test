<%@page import="utility.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String topic=request.getParameter("topic");
String description=request.getParameter("description");
String date=request.getParameter("date");
try
{
Connection con = DBConnection.getConnection();
Statement st=con.createStatement();
int i=st.executeUpdate("insert into news(topic,description,date)values('"+topic+"','"+description+"','"+date+"')");

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>

</body>
</html>