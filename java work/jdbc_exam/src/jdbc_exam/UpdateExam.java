package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExam {
	
	// update 하는 기능을 메소드로 정의
	// 접근제한자 리턴차입 메소드면 (매개변수들...)
	
	public static int updateDept(int deptno, String dName, String loc) {
		int count = 0;
		
		// 필요한 객체를 선언!!
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
		// 1. 접속
			// 1-1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // 보통 약속된 형식이 있음. 각 DBMS마다 조금씩 차이는 있지만
			String user = "testuser";
			String password = "won9975744!";
			
			conn =  DriverManager.getConnection(url, user, password);
			
		// 2. 쿼리 작성
			ps = conn.prepareStatement("update dept set dname = ? where deptno = ?");
			
			// 값에 대한 바인딩
			ps.setString(1, dName); // 컬럼명 or ?순서 = 1
			ps.setInt(2, deptno);
			
		// 3. 쿼리 실행
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 4. 접속 종료!!
			if(ps != null) {
				try {
					ps.close();					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
//		UpdateExam update = new UpdateExam();
		int result = updateDept(50, "사무팀", "");
		System.out.println(result);
		if(result > 0) {
			System.out.println(result + "건 수정되었습니다.");
		}else {
			System.out.println("수정 오류!");
		}
	}
}
