package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import model.Doctor;

public class DoctorDao {
	public static void insertDoctor(Doctor d) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into doctor(name,contact,address,speciality,exp,email,password) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setLong(2, d.getContact());
			pst.setString(3, d.getAddress());
			pst.setString(4, d.getSpeciality());
			pst.setString(5, d.getExperience());
			pst.setString(6, d.getEmail());
			pst.setString(7, d.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Doctor doctorLogin(String email, String password) {
		Doctor d = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from doctor where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt("id"));
				d.setName(rs.getString("name"));
				d.setContact(rs.getLong("contact"));
				d.setAddress(rs.getString("address"));
				d.setSpeciality(rs.getString("speciality"));
				d.setExperience(rs.getString("exp"));
				d.setEmail(rs.getString("email"));
				d.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	public static void updateDoctorProfile(Doctor d) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update doctor set name=?,contact=?,address=?,speciality=?,exp=?,email=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setLong(2, d.getContact());
			pst.setString(3, d.getAddress());
			pst.setString(4, d.getSpeciality());
			pst.setString(5, d.getExperience());
			pst.setString(6, d.getEmail());
			pst.setInt(7, d.getId());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkOldPassword(String email, String op) {
		boolean flag = false;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from doctor where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, op);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void updatePass(String email, String np) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update doctor set password=? where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("pass updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
