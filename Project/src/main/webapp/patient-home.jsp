<%@page import="dao.DoctorDao"%>
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

	<!-- portfolio -->
	<section class="section doctors">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6 text-center">
					<div class="section-title">
						<h2>Doctors</h2>
						<div class="divider mx-auto my-4"></div>
					</div>
				</div>
			</div>


			<div class="row shuffle-wrapper portfolio-gallery">
				<%
				List<Doctor> list = DoctorDao.getAllDoctors();
				%>
				<%
				for (Doctor d1 : list) {
				%>
				<div class="col-lg-3 col-sm-6 col-md-6 mb-4 shuffle-item"
					data-groups="[&quot;cat1&quot;,&quot;cat2&quot;]">
					<div class="position-relative doctor-inner-box">
						<div class="doctor-profile">
							<div class="doctor-img">
								<img src="imagess/<%=d1.getImage()%>" alt="doctor-image"
									class="img-fluid w-100">
							</div>
						</div>
						<div class="content mt-3">
							<h4 class="mb-0">
								<a href="doctor-single.jsp?id=<%=d1.getId()%>"><%=d1.getName()%></a>
							</h4>
							<p><%=d1.getSpeciality()%></p>
						</div>
					</div>
				</div>
				<%
				}
				%>
			</div>

		</div>
	</section>
	<!-- /portfolio -->
</body>
</html>