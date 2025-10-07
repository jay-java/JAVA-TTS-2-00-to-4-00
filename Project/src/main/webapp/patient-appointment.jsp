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
	int id = Integer.parseInt(request.getParameter("did"));
	%>
	<%
	Doctor d1 = DoctorDao.getDoctorById(id);
	%>
	<section class="contact-form-wrap section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6">
					<div class="section-title text-center">
						<h2 class="text-md mb-2">Book Appointment</h2>
						<div class="divider mx-auto my-4"></div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12">
					<form id="contact-form" class="contact__form " method="post"
						action="Appointment">
						<input name="pid" id="phone" type="hidden" value="<%=d.getId()%>">
						<input name="did" id="phone" type="hidden" value="<%=d1.getId()%>">
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<input name="disease" id="phone" type="text"
										class="form-control" placeholder="Enter Disease">
								</div>
							</div>
						</div>
						<!-- <div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<select name="time">
										<option value="11:00 AM - 1:00 PM">11:00 AM - 1:00 PM
										<option value="2:00 PM - 4:00 PM">2:00 PM - 4:00 PM
										<option value="5:00 PM - 7:00 PM">5:00 PM - 7:00 PM
									</select>
								</div>
							</div>
						</div> -->
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<input name="date" id="phone" type="date" class="form-control">
								</div>
							</div>
						</div>



						<div class="text-center">
							<input class="btn btn-main btn-round-full" name="action"
								type="submit" value="book"></input>
						</div>
					</form>
				</div>
			</div>

		</div>
	</section>

</body>
</html>