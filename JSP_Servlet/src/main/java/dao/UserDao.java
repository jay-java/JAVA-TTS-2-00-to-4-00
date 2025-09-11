package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;
import model.User;

public class UserDao {
	public static void insertUser(User u) {
		try {
			Connection conn = DBConnection.createConnection();
			String url = "insert into user(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(url);
			pst.setString(1, u.getName());
			pst.setLong(2,u.getContact());
			pst.setString(3,u.getAddress());
			pst.setString(4, u.getEmail());
			pst.setString(5, u.getPassword());
			//DML - > executeUPdate
			//DQL -> select -> executeQuery
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
