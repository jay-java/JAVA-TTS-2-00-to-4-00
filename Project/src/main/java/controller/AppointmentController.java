package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AppointmentDao;
import dao.DoctorDao;
import dao.PatientDao;
import model.Appointment;
import model.Doctor;
import model.Patient;

/**
 * Servlet implementation class AppointmentController
 */
@WebServlet("/Appointment")
public class AppointmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AppointmentController() {
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
		if (action.equalsIgnoreCase("book")) {
			Appointment a = new Appointment();

			Doctor d = DoctorDao.getDoctorById(Integer.parseInt(request.getParameter("did")));
			Patient p = PatientDao.getPatinetById(Integer.parseInt(request.getParameter("pid")));

			a.setPid(Integer.parseInt(request.getParameter("pid")));
			a.setDid(Integer.parseInt(request.getParameter("did")));
			a.setImage(d.getImage());
			a.setDname(d.getName());
			a.setDcategory(d.getSpeciality());
			a.setDaddress(d.getAddress());
			a.setPname(p.getName());
			a.setPcontact(d.getContact());
			a.setDisease(request.getParameter("disease"));
			a.setStatus("pending");
			String bookingDate = request.getParameter("date");
			Date date = Date.valueOf(bookingDate);
			a.setDate(date);
			System.out.println(a);
			
			AppointmentDao.bookApp(a);
			response.sendRedirect("patient-home.jsp");

		}
	}

}
