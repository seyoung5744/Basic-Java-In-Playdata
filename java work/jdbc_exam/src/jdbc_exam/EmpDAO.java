package jdbc_exam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class EmpDAO {
	public void insertEmp(EmpDTO empDto) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
		// 1. DB접속 Connection 객체를 얻어온다.
			conn = DBUtil.getConnection();
			
			
		// 2. 쿼리 작성
			String sql = 
					"insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
					+ "values (?,?,?,?,sysdate(),?,?,?)";
					// sysdate() : mysql 함수. 시스템 시간 얻기
			ps = conn.prepareStatement(sql);
			
			// 값에 대한 바인딩 - query 까지 만들어두고 실행은 안한 상태
			
			// 이곳에서의 문제는 많은 컬럼이 존재하면 이렇게 하나하나 set해주는 것도 불편하고
			// 나중에 db에서 가져왔을때 각각 가져오는것이 불편함.
			// => DTO로 해결. 값들을 모은 객체
			ps.setInt(1, empDto.getEmpNo());
			ps.setString(2, empDto.geteName());
			ps.setString(3,empDto.getJob()); 
			ps.setInt(4, empDto.getMgr());
			ps.setDouble(5, empDto.getSal());
			ps.setDouble(6,empDto.getComm());
			ps.setInt(7, empDto.getDeptNo());

		// 3. 쿼리 실행
			int count = ps.executeUpdate();
			if(count > 0) {
				System.out.println(count + "건 입력 성공!");
			}else {
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
}
