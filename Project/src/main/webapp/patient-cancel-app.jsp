<%@page import="dao.AppointmentDao"%>
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
	int aid = Integer.parseInt(request.getParameter("aid"));
	AppointmentDao.deleteAppByAid(aid);
	response.sendRedirect("patient-pending-appointments.jsp");
	%>
</body>
</html>