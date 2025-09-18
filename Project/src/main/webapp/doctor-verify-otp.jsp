<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section class="contact-form-wrap section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6">
					<div class="section-title text-center">
						<h2 class="text-md mb-2">Doctor Verify OTP</h2>
						<div class="divider mx-auto my-4"></div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12">
					<form id="contact-form" class="contact__form " method="post"
						action="mail.php">
						<!-- form message -->
						<div class="row">
							<div class="col-12">
								<div class="alert alert-success contact__msg"
									style="display: none" role="alert">Your message was sent
									successfully.</div>
							</div>
						</div>

						<div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<input name="phone" id="phone" type="text" class="form-control"
										placeholder="Enter OTP">
								</div>
							</div>
						</div>

						<div class="text-center">
							<input class="btn btn-main btn-round-full" name="submit"
								type="submit" value="verify"></input>
						</div>
					</form>
				</div>
			</div>

		</div>
	</section>
</body>
</html>