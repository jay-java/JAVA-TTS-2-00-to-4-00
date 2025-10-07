<%@page import="dao.AppointmentDao"%>
<%@page import="model.Appointment"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="doctor-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Patient Name</th>
					<th>Patient Contact</th>
					<th>Patient Disease</th>
					<th>Status</th>
					<th>Date</th>
					<th>Accept</th>
					<th>Reject</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Appointment> list = AppointmentDao.getPendingAppointmentsByDid(d.getId());
				%>
				<%
				for (Appointment a : list) {
				%>
				<tr>
					<td><%=a.getPname()%></td>
					<td><%=a.getPcontact()%></td>
					<td><%=a.getDisease()%></td>
					<td><%=a.getStatus()%></td>
					<td><%=a.getDate()%></td>
					<td><a href="doctor-accept-app.jsp?aid=<%=a.getAid()%>"
						class="btn btn-main btn-round-full">Accept</a></td>
					<td><a href="doctor-reject-app.jsp?aid=<%=a.getAid()%>"
						class="btn btn-main btn-round-full">Reject</a></td>

				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>