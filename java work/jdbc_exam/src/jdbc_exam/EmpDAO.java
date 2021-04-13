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
		// 1. DB���� Connection ��ü�� ���´�.
			conn = DBUtil.getConnection();
			
			
		// 2. ���� �ۼ�
			String sql = 
					"insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
					+ "values (?,?,?,?,sysdate(),?,?,?)";
					// sysdate() : mysql �Լ�. �ý��� �ð� ���
			ps = conn.prepareStatement(sql);
			
			// ���� ���� ���ε� - query ���� �����ΰ� ������ ���� ����
			
			// �̰������� ������ ���� �÷��� �����ϸ� �̷��� �ϳ��ϳ� set���ִ� �͵� �����ϰ�
			// ���߿� db���� ���������� ���� �������°��� ������.
			// => DTO�� �ذ�. ������ ���� ��ü
			ps.setInt(1, empDto.getEmpNo());
			ps.setString(2, empDto.geteName());
			ps.setString(3,empDto.getJob()); 
			ps.setInt(4, empDto.getMgr());
			ps.setDouble(5, empDto.getSal());
			ps.setDouble(6,empDto.getComm());
			ps.setInt(7, empDto.getDeptNo());

		// 3. ���� ����
			int count = ps.executeUpdate();
			if(count > 0) {
				System.out.println(count + "�� �Է� ����!");
			}else {
				System.out.println("�Է� ����!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		// 4. ���� ����!!
			DBUtil.close(conn, ps);
		}
	}
}
