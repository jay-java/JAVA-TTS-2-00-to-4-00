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
	String msg = (String) request.getAttribute("msg");
	%>
	<%
	if (msg != null) {
	%>
	<h3>
		<%
		out.print(msg);
		%>
	</h3>
	<%
	}
	%>
	<form action="UserController" method="post">
		<table>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email"></td>
			</tr>

			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td><input type="submit" name="action" value="login"></td>
			</tr>

		</table>
	</form>
	<h1><a href="register.jsp">If do not have account click here</a></h1>
</body>
</html>