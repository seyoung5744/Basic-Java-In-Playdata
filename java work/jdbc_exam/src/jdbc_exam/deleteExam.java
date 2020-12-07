package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteExam {
	public static void main(String[] args) {
		// 0. 드라이버 로딩. (실제 구현된 클래스를 메모리에 올린다.)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 1. DB접속 Connection 객체를 얻어오면 된다.
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // 보통 약속된 형식이 있음. 각 DBMS마다 조금씩 차이는 있지만
		String user = "testuser";
		String password = "won9975744!";

		String sql = "delete from dept where deptno = ?";

		int count = 0;
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, 50);
			count = ps.executeUpdate(); // insert, update, delete같은 경우 사용, return int
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (count > 0) {
				System.out.println(count + "건 delete 성공!!");
			} else {
				System.out.println("delete 실패!!");
			}
		}
	}
}
