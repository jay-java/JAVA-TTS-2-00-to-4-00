package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.PatientDao;
import model.Patient;

/**
 * Servlet implementation class Patient
 */
@WebServlet("/Patient")
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PatientController() {
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
		if (action.equalsIgnoreCase("Register")) {
			Patient d = new Patient();
			d.setName(request.getParameter("name"));
			d.setContact(Long.parseLong(request.getParameter("contact")));
			d.setAddress(request.getParameter("address"));
			d.setEmail(request.getParameter("email"));
			d.setPassword(request.getParameter("password"));
			System.out.println(d);
			PatientDao.insertPatient(d);
			response.sendRedirect("patient-login.jsp");
		} else if (action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			Patient d = PatientDao.patientLogin(email, pass);
			if (d != null) {
				HttpSession session = request.getSession();
				session.setAttribute("data", d);
				request.getRequestDispatcher("patient-home.jsp").forward(request, response);
			} else {

			}
		}
	}

}
