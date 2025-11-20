package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Doctor;

public class DoctorDao {
	public static void insertDoctor(Doctor d) throws SQLException {
		Connection conn = DBConnection.createConnection();
		try {
			String sql = "insert into doctor(image,name,contact,address,speciality,exp,email,password) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, d.getImage());
			pst.setString(2, d.getName());
			pst.setLong(3, d.getContact());
			pst.setString(4, d.getAddress());
			pst.setString(5, d.getSpeciality());
			pst.setString(6, d.getExperience());
			pst.setString(7, d.getEmail());
			pst.setString(8, d.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
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
				d.setImage(rs.getString("image"));
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

	public static List<Doctor> getAllDoctors() {
		List<Doctor> list = new ArrayList<Doctor>();

		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from doctor";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Doctor d = new Doctor();
				d.setId(rs.getInt("id"));
				d.setImage(rs.getString("image"));
				d.setName(rs.getString("name"));
				d.setContact(rs.getLong("contact"));
				d.setAddress(rs.getString("address"));
				d.setSpeciality(rs.getString("speciality"));
				d.setExperience(rs.getString("exp"));
				list.add(d);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Doctor getDoctorById(int id) {
		Doctor d = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from doctor where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				d = new Doctor();
				d.setId(rs.getInt("id"));
				d.setImage(rs.getString("image"));
				d.setName(rs.getString("name"));
				d.setContact(rs.getLong("contact"));
				d.setAddress(rs.getString("address"));
				d.setSpeciality(rs.getString("speciality"));
				d.setExperience(rs.getString("exp"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

}
