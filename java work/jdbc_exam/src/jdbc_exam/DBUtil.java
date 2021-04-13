package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	static String URL = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // ���� ��ӵ� ������ ����. �� DBMS���� ���ݾ� ���̴� ������
	static String USER = "testuser";
	static String PASSWORD = "won9975744!";
	static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	// ���� - Connection��ü�� ���´�
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		// 1. Ŭ���� �ε�
		Class.forName(DRIVER_NAME);
		// 2. ����̺� �Ŵ����� connection ��ü ������
		conn = DriverManager.getConnection(URL, USER, PASSWORD);

		return conn;
	}

	// ���� ����
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
