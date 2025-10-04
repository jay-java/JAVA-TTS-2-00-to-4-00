package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;
import model.Patient;

public class PatientDao {
	public static void insertPatient(Patient d) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into patient(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, d.getName());
			pst.setLong(2, d.getContact());
			pst.setString(3, d.getAddress());
			pst.setString(4, d.getEmail());
			pst.setString(5, d.getPassword());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Patient patientLogin(String email, String password) {
		Patient d = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from patient where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				d = new Patient();
				d.setId(rs.getInt("id"));
				d.setName(rs.getString("name"));
				d.setContact(rs.getLong("contact"));
				d.setAddress(rs.getString("address"));
				d.setEmail(rs.getString("email"));
				d.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	public static Patient getPatinetById(int pid) {
		Patient d = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from patient where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				d = new Patient();
				d.setId(rs.getInt("id"));
				d.setName(rs.getString("name"));
				d.setContact(rs.getLong("contact"));
				d.setAddress(rs.getString("address"));
				d.setEmail(rs.getString("email"));
				d.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

}
