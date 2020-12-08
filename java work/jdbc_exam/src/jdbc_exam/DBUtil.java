package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	static String URL = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // 보통 약속된 형식이 있음. 각 DBMS마다 조금씩 차이는 있지만
	static String USER = "testuser";
	static String PASSWORD = "won9975744!";
	static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	// 접속 - Connection객체를 얻어온다
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		// 1. 클래스 로딩
		Class.forName(DRIVER_NAME);
		// 2. 드라이브 매니저로 connection 객체 얻어오기
		conn = DriverManager.getConnection(URL, USER, PASSWORD);

		return conn;
	}

	// 접속 종료
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Connection conn, PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
	}
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn, ps);
	}
}
