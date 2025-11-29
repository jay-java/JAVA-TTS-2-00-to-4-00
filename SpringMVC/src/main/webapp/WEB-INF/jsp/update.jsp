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
<form action="${pageContext.request.contextPath}/add" method="post">
	<label for="fname">Id:</label><br>
  <input type="text" id="fname" name="id" value="${u.id }"><br><br>
  <label for="fname">Name:</label><br>
  <input type="text" id="fname" name="name" value="${u.name }"><br><br>
  <label for="lname">Contact:</label><br>
  <input type="text" id="lname" name="contact" value="${u.contact }" ><br><br>
   <label for="fname">Address:</label><br>
  <input type="text" id="fname" name="address" value="${u.address }"><br><br>
   <label for="fname">Email:</label><br>
  <input type="email" id="fname" name="email" value="${u.email }"><br><br>
   <label for="fname">Password:</label><br>
  <input type="password" id="fname" name="password" value="${u.password }"><br><br>
  <input type="submit" name="action" value="Update">
</form> 
</body>
</html>