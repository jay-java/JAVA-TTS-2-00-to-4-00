<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	}
	%>
	
	<h1>Name, <%=u.getName() %></h1>
	<h1>Contact, <%=u.getContact() %></h1>
	<h1>Address, <%=u.getAddress() %></h1>
	<h1>Email, <%=u.getEmail() %></h1>
	<h1>Password, <%=u.getPassword() %></h1>
</body>
</html>