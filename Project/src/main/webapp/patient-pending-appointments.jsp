<%@page import="dao.AppointmentDao"%>
<%@page import="model.Appointment"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="patient-header.jsp"%>
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
					<th>Doctor Name</th>
					<th>Specialist</th>
					<th>Doctor Address</th>
					<th>Disease</th>
					<th>Status</th>
					<th>Date</th>
					<th>Cancel</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Appointment> list = AppointmentDao.getPendingAppointmentsByPid(d.getId());
				%>
				<%
				for (Appointment a : list) {
				%>
				<tr>
					<td><%=a.getDname()%></td>
					<td><%=a.getDcategory()%></td>
					<td><%=a.getDaddress()%></td>
					<td><%=a.getDisease()%></td>
					<td><%=a.getStatus()%></td>
					<td><%=a.getDate()%></td>
					<td><a href="patient-cancel-app.jsp?aid=<%=a.getAid() %>" class="btn btn-main btn-round-full">Cancel</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>