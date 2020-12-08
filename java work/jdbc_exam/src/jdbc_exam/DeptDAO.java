package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO의 단위는 테이블당 하나
public class DeptDAO {
	// 이렇게 연결, statement 객체를 전역으로 선언해두면 안됨. 즉, 통로를 하나 만들어두고 그걸 공용해서 사용하는 것
	// connect은 각각의 작업마다 만들어둬야 함.
	//
	// 좋은 방법은 연결된 풀을 만들어 두고 이용하는것. 즉, 중간 단계를 두고 사용.
	// => 일 하나 할때마다 DB에 connect을 하면 드는 비용이 많기 때문에 미리 연결해두고 거기에서 할당받아 사용.

	// 지금 코드에선 DB에 연결 종료하는 코드가 중복되서 불편하다...그래서 DBUtil이라고 따고 분리.

//	private Connection conn = null;
//	private PreparedStatement ps = null;
//
//	public void insertDept(int deptno, String dname, String loc) {
//		// 1. DB접속 Connection 객체를 얻어온다.
//		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // 보통 약속된 형식이 있음. 각 DBMS마다 조금씩 차이는 있지만
//		String user = "testuser";
//		String password = "won9975744!";
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//
//		// 2. 쿼리 작성
//			String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
//			ps = conn.prepareStatement(sql);
//			
//			// 값에 대한 바인딩
//			ps.setInt(1, deptno);
//			ps.setString(2, dname);
//			ps.setString(3, loc); // query 까지 만들어두고 실행은 안한 상태
//
//		// 3. 쿼리 실행
//			count = ps.executeUpdate();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//		// 4. 접속 종료!!
//			if (ps != null) {
//				try {
//					ps.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if(conn != null) {
//				try {
//					conn.close();					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//
//	public int updateDept(int deptno, String dname, String loc) {
//		int count = 0;
//		// 1. DB접속 Connection 객체를 얻어온다.
//		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // 보통 약속된 형식이 있음. 각 DBMS마다 조금씩 차이는 있지만
//		String user = "testuser";
//		String password = "won9975744!";
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//
//		// 2. 쿼리 작성
//			String sql = "update dept set dname = ? where deptno = ?";
//			ps = conn.prepareStatement(sql);
//			// 값에 대한 바인딩
//			ps.setString(1, dname); // 컬럼명 or ?순서 = 1
//			ps.setInt(2, deptno);
//
//		// 3. 쿼리 실행
//			count = ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//		// 4. 접속 종료!!
//			if (ps != null) {
//				try {
//					ps.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if(conn != null) {
//				try {
//					conn.close();					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return count;
//	}

	/*
	 * DBUtil 만들고 재수정한 코드
	 */

	public void insertDept(DeptDTO dept) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 1. DB접속 Connection 객체를 얻어온다.
			conn = DBUtil.getConnection();

			// 2. 쿼리 작성
			String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
			ps = conn.prepareStatement(sql);

			// 값에 대한 바인딩
			ps.setInt(1, dept.getDeptno());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLoc()); // query 까지 만들어두고 실행은 안한 상태

			// 3. 쿼리 실행
			int count = ps.executeUpdate();
			if (count > 0) {
				System.out.println(count + "건 입력 성공!");
			} else {
				System.out.println("입력 실패!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 4. 접속 종료!!
			DBUtil.close(conn, ps);
		}
	}

	public int updateDept(int deptno, String dname, String loc) {
		Connection conn = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			// 1. DB접속 Connection 객체를 얻어온다.
			conn = DBUtil.getConnection();
			// 2. 쿼리 작성
			String sql = "update dept set dname = ? loc = ?where deptno = ?";
			ps = conn.prepareStatement(sql);
			// 값에 대한 바인딩
			ps.setString(1, dname); // 컬럼명 or ?순서 = 1
			ps.setString(2, loc);
			ps.setInt(3, deptno);

			// 3. 쿼리 실행
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4. 접속 종료!!
			DBUtil.close(conn, ps);
		}

		return count;
	}

	// 조회 (한건)
	public DeptDTO getDept(int deptno) {
		DeptDTO dept = null;
		// 1. 선언
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// 2. 접속
			conn = DBUtil.getConnection();

			// 3. 쿼리 작성
			String sql = "select deptno, dname, loc from dept where deptno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, deptno);

			// 4. 실행
			rs = ps.executeQuery();

			// 5. 결과 값 얻어오기
			if (rs.next()) {
				dept = new DeptDTO();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6. 접속 종료
			DBUtil.close(conn, ps, rs);
		}

		return dept;
	}

	// 여러 건 조회
}
