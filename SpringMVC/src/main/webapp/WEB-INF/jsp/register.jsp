<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
register page
<form action="add" method="post">
  <label for="fname">Name:</label><br>
  <input type="text" id="fname" name="name"><br><br>
  <label for="lname">Contact:</label><br>
  <input type="text" id="lname" name="contact" ><br><br>
   <label for="fname">Address:</label><br>
  <input type="text" id="fname" name="address"><br><br>
   <label for="fname">Email:</label><br>
  <input type="email" id="fname" name="email"><br><br>
   <label for="fname">Password:</label><br>
  <input type="password" id="fname" name="password"><br><br>
  <input type="submit" name="action" value="Register">
</form> 

</body>
</html>