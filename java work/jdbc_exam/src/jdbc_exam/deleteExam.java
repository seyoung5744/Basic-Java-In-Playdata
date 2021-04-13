package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteExam {
	public static void main(String[] args) {
		// 0. ����̹� �ε�. (���� ������ Ŭ������ �޸𸮿� �ø���.)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 1. DB���� Connection ��ü�� ������ �ȴ�.
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // ���� ��ӵ� ������ ����. �� DBMS���� ���ݾ� ���̴� ������
		String user = "testuser";
		String password = "won9975744!";

		String sql = "delete from dept where deptno = ?";

		int count = 0;
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, 50);
			count = ps.executeUpdate(); // insert, update, delete���� ��� ���, return int
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (count > 0) {
				System.out.println(count + "�� delete ����!!");
			} else {
				System.out.println("delete ����!!");
			}
		}
	}
}
