<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	index page
	
	<a href="register">Register</a>
	<%-- 	<h1>
		<a href="register">Register</a>
	</h1>
	<%
	int num = (Integer) request.getAttribute("number");
	%>
	<h1>
		<%
		out.print(num);
		%>
	</h1>

	<%
	String name = (String) request.getAttribute("name");
	%>
	<h1>
		<%
		out.print(name);
		%>
	</h1>

	<%
	double d = (Double) request.getAttribute("double");
	%>
	<h1>
		<%
		out.print(d);
		%>
	</h1>
	<%
	List list = (List) request.getAttribute("list");
	%>
	<h1>
		<%
		out.print(list);
		%>
	</h1>
	 --%>

	<h1>${number }</h1>
	<h1>${name }</h1>
	<h1>${list }</h1>
	<c:forEach items="${list }" var="u">
		<h1>${u }</h1>
	</c:forEach>


</body>
</html>