<%@page import="java.util.List"%>
<%@page import="dao.UserDao"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>.
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>

	<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	%>

	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	}
	%>

	<h1 class="text-center">
		Name,
		<%=u.getName()%></h1>
	<%-- <h1>Contact, <%=u.getContact() %></h1>
	<h1>Address, <%=u.getAddress() %></h1>
	<h1>Email, <%=u.getEmail() %></h1>
	<h1>Password, <%=u.getPassword() %></h1> --%>


	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Sr No.</th>
					<th scope="col">Name</th>
					<th scope="col">Contact</th>
					<th scope="col">Address</th>
					<th scope="col">Email</th>
					<th scope="col">Password</th>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<User> list = UserDao.getAllUsers();
				%>
				<%
				int counter = 0;
				%>
				<%
				for (User u1 : list) {
					counter++;
				%>
				<tr>
					<th scope="row"><%=counter%></th>
					<td><%=u1.getName()%></td>
					<td><%=u1.getContact()%></td>
					<td><%=u1.getAddress()%></td>
					<td><%=u1.getEmail()%></td>
					<td><%=u1.getPassword()%></td>
					<td>
						<form action="UserController" method="post">
							<input type="hidden" name="id" value="<%=u1.getId()%>"> <input
								type="submit" name="action" value="edit">
						</form>
					</td>
					<td><a href="UserController?action=delete&id=<%=u.getId()%>">Delete</a></td>
					<td><a href="delete.jsp?id=<%=u.getId()%>">Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		<h1 class="text-center">
			<a href="logout.jsp">Logout</a>
		</h1>
	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>
