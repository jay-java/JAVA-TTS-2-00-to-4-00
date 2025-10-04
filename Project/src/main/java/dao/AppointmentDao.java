package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.Appointment;

public class AppointmentDao {
	public static void bookApp(Appointment a) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into appointment(pid,did,image,dname,dcategory,daddress,pname,pcontact,disease,status,date) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, a.getPid());
			pst.setInt(2, a.getDid());
			pst.setString(3, a.getImage());
			pst.setString(4, a.getDname());
			pst.setString(5, a.getDcategory());
			pst.setString(6, a.getDaddress());
			pst.setString(7, a.getPname());
			pst.setLong(8, a.getPcontact());
			pst.setString(9, a.getDisease());
			pst.setString(10, a.getStatus());
			pst.setDate(11, a.getDate());
			pst.executeUpdate();
			System.out.println("booked");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
