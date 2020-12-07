package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connExam {
	public static void main(String[] args) {
		
		// 워크벤치나 콘솔을 이용해서 db에 접속했었음.
		// ex) mysql -u test -p
		// 아이디 비밀번호 등 정보를 알려주고 DBMS에 접속한다.
		
		// 1. Connection 객체를 얻어내면 접속 성공!!
//  List list = new ArrayList<String>();
		
		// 0. 실제 구현된 코드가 메모리에 올라와야 한다!! 드라이버 로딩!!
		// 메모리에 올려놓게 하는 명령은 new 와 class.forName()
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 해당 클래스가 없기 때문에 초기에는 실행 실패
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null; // 실제 구현을 하고 있는 것은 우리가 사용하는 DB회사가~~
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // 보통 약속된 형식이 있음. 각 DBMS마다 조금씩 차이는 있지만
		String user = "testuser";
		String password = "won9975744!";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null)
				System.out.println("^^");
			else
				System.out.println("-__-;;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
