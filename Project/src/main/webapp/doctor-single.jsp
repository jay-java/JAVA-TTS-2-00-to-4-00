<%@page import="dao.DoctorDao"%>
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
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	%>
	<%
	Doctor d1 = DoctorDao.getDoctorById(id);
	%>
	<section class="section doctor-single">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-6">
					<div class="doctor-img-block">
						<img src="imagess/<%=d1.getImage()%>" alt=""
							class="img-fluid w-100">

						<div class="info-block mt-4">
							<h4 class="mb-0"><%=d1.getName()%></h4>
							<p><%=d1.getSpeciality()%></p>
						</div>
					</div>
				</div>

				<div class="col-lg-8 col-md-6">
					<div class="doctor-details mt-4 mt-lg-0">
						<h2 class="text-md">Introducing to myself</h2>
						<div class="divider my-4"></div>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Quam tempore cumque voluptate beatae quis inventore sapiente
							nemo, a eligendi nostrum expedita veritatis neque incidunt ipsa
							doloribus provident ex, at ullam. Lorem ipsum dolor sit amet,
							consectetur adipisicing elit. Ipsam, perferendis officiis esse
							quae, nobis eius explicabo quidem? Officia accusamus repudiandae
							ea esse non reiciendis accusantium voluptates, facilis enim,
							corrupti eligendi?</p>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Nemo recusandae veritatis minus optio quod obcaecati laborum
							temporibus, deleniti vero perferendis molestias, ducimus facilis,
							sunt minima. Tempora, amet quasi asperiores voluptas?</p>

						<a href="appoinment.html"
							class="btn btn-main-2 btn-round-full mt-3">Make an Appoinment<i
							class="icofont-simple-right ml-2  "></i></a>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>