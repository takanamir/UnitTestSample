package jp.co.bbreak.sokusen.test3.dbunit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public User findByUserid(String userid) {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		User user = new User();

		// testデータベースにsaユーザ（パスワードなし）H2DBへ接続
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM USER WHERE USERID = ?");
			pstmt.setString(1, userid);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				user.setUserid(rs.getString("USERID"));
				user.setName(rs.getString("NAME"));
				user.setAge(rs.getInt("AGE"));
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}