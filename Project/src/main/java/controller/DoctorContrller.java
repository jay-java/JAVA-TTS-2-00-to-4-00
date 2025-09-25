package controller;

import java.io.IOException;
import java.util.Random;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DoctorDao;
import model.Doctor;
import send_mail.EmailSender;

/**
 * Servlet implementation class Doctor
 */
@WebServlet("/Doctor")
public class DoctorContrller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoctorContrller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Doctor d = new Doctor();
			d.setName(request.getParameter("name"));
			d.setContact(Long.parseLong(request.getParameter("contact")));
			d.setAddress(request.getParameter("address"));
			d.setSpeciality(request.getParameter("speciality"));
			d.setExperience(request.getParameter("exp"));
			d.setEmail(request.getParameter("email"));
			d.setPassword(request.getParameter("password"));
			System.out.println(d);
			DoctorDao.insertDoctor(d);
			response.sendRedirect("doctor-login.jsp");
		} else if (action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			Doctor d = DoctorDao.doctorLogin(email, pass);
			if (d != null) {
				HttpSession session = request.getSession();
				session.setAttribute("data", d);
				request.getRequestDispatcher("doctor-home.jsp").forward(request, response);
			} else {

			}
		} else if (action.equalsIgnoreCase("update")) {
			Doctor d = new Doctor();
			d.setId(Integer.parseInt(request.getParameter("id")));
			d.setName(request.getParameter("name"));
			d.setContact(Long.parseLong(request.getParameter("contact")));
			d.setAddress(request.getParameter("address"));
			d.setSpeciality(request.getParameter("speciality"));
			d.setExperience(request.getParameter("exp"));
			d.setEmail(request.getParameter("email"));
			DoctorDao.updateDoctorProfile(d);
			HttpSession session = request.getSession();
			session.setAttribute("data", d);
			request.getRequestDispatcher("doctor-profile.jsp").forward(request, response);

		}

		else if (action.equalsIgnoreCase("change password")) {
			String email = request.getParameter("email");
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = DoctorDao.checkOldPassword(email, op);
			if (flag == true) {
				if (np.equals(cnp)) {
					DoctorDao.updatePass(email, np);
					response.sendRedirect("doctor-home.jsp");
				} else {
					request.setAttribute("msg", "NP and CNP not matched");
					request.getRequestDispatcher("doctor-change-password.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "Old pass incorrect");
				request.getRequestDispatcher("doctor-change-password.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("send OTP")) {
			String email = request.getParameter("email");
			Random r = new Random();
			int num = r.nextInt(100000, 999999);
			System.out.println(num);
			try {
				EmailSender.sendOTP(email, num);
				request.setAttribute("otp", num);
				request.setAttribute("email", email);
				request.getRequestDispatcher("doctor-verify-otp.jsp").forward(request, response);

			} catch (MessagingException e) {
				e.printStackTrace();
			}
		} else if (action.equalsIgnoreCase("verify")) {
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if (otp1 == otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("doctor-new-pass.jsp").forward(request, response);
			} else {
				request.setAttribute("msg", "OTP not matched");
				request.setAttribute("otp", otp1);
				request.setAttribute("email", email);
				request.getRequestDispatcher("doctor-verify-otp.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("new password")) {
			String email = request.getParameter("email");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			if (np.equals(cnp)) {
				DoctorDao.updatePass(email, np);
				response.sendRedirect("doctor-login.jsp");
			} else {

			}
		}
	}

}
