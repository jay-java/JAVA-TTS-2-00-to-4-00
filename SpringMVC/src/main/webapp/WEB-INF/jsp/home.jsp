<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
	home page
	<h1>
		<a href="${pageContext.request.contextPath}/register">Add other</a>
	</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Contact</th>
			<th>Address</th>
			<th>Email</th>
			<th>Password</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list }" var="u">
			<tr>
				<td>${u.id }</td>
				<td>${u.name }</td>
				<td>${u.contact }</td>
				<td>${u.address }</td>
				<td>${u.email }</td>
				<td>${u.password }</td>
				<td><a href="edit/${u.id }">Edit</a></td>
				<td><a href="delete/${u.id }">Delete</a></td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>