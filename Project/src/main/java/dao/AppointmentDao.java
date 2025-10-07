package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

	public static List<Appointment> getPendingAppointmentsByPid(int pid) {
		List<Appointment> list = new ArrayList<Appointment>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from appointment where pid=? and status='pending'";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Appointment a = new Appointment();
				a.setAid(rs.getInt("aid"));
				a.setPid(rs.getInt("pid"));
				a.setDid(rs.getInt("did"));
				a.setImage(rs.getString("image"));
				a.setDname(rs.getString("dname"));
				a.setDcategory(rs.getString("dcategory"));
				a.setDaddress(rs.getString("daddress"));
				a.setPname(rs.getString("pname"));
				a.setPcontact(rs.getLong("pcontact"));
				a.setDisease(rs.getString("disease"));
				a.setStatus(rs.getString("status"));
				a.setDate(rs.getDate("date"));
				list.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Appointment> getPendingAppointmentsByDid(int did) {
		List<Appointment> list = new ArrayList<Appointment>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from appointment where did=? and status='pending'";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, did);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Appointment a = new Appointment();
				a.setAid(rs.getInt("aid"));
				a.setPid(rs.getInt("pid"));
				a.setDid(rs.getInt("did"));
				a.setImage(rs.getString("image"));
				a.setDname(rs.getString("dname"));
				a.setDcategory(rs.getString("dcategory"));
				a.setDaddress(rs.getString("daddress"));
				a.setPname(rs.getString("pname"));
				a.setPcontact(rs.getLong("pcontact"));
				a.setDisease(rs.getString("disease"));
				a.setStatus(rs.getString("status"));
				a.setDate(rs.getDate("date"));
				list.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void deleteAppByAid(int aid) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "delete from appointment where aid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, aid);
			pst.executeUpdate();
			System.out.println("cancelled");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
