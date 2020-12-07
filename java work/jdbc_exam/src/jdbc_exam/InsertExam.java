package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExam {
	public static void main(String[] args) throws Exception {
		// 0. 드라이버 로딩. (실제 구현된 클래스를 메모리에 올린다.)
		Class.forName("com.mysql.cj.jdbc.Driver"); // DB 회사, DB 버전에 따라 다르다.
		
		// 1. DB접속 Connection 객체를 얻어오면 된다.
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // 보통 약속된 형식이 있음. 각 DBMS마다 조금씩 차이는 있지만
		String user = "testuser";
		String password = "won9975744!";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		// 2. 쿼리문 작성 Statement 객체를 얻어온다.
		String deptName = "인사팀";
		String loc = "서초구 서초동";
		String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql); 
		ps.setInt(1, 50);
		ps.setString(2, deptName);
		ps.setString(3, loc); // query 까지 만들어두고 실행은 안한 상태
		
		
		// 3. 실행!!
		int count = ps.executeUpdate(); // insert, update, delete같은 경우 사용, return int
		if(count > 0) {
			System.out.println(count + "건 입력 성공!!");
		}else {
			System.out.println("입력 실패!!");
		}
//		ps.executeQuery(); // 테이블을 얻어와야 할때 사용. return ResultSet
		
		// 3. 사용 후엔 db연결에서 사용된 순서와 반대로 close
		ps.close(); 
		conn.close();
		
		
	}
}
