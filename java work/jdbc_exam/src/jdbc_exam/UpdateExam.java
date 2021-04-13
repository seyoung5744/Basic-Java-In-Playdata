package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExam {
	
	// update �ϴ� ����� �޼ҵ�� ����
	// ���������� �������� �޼ҵ�� (�Ű�������...)
	
	public static int updateDept(int deptno, String dName, String loc) {
		int count = 0;
		
		// �ʿ��� ��ü�� ����!!
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
		// 1. ����
			// 1-1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // ���� ��ӵ� ������ ����. �� DBMS���� ���ݾ� ���̴� ������
			String user = "testuser";
			String password = "won9975744!";
			
			conn =  DriverManager.getConnection(url, user, password);
			
		// 2. ���� �ۼ�
			ps = conn.prepareStatement("update dept set dname = ? where deptno = ?");
			
			// ���� ���� ���ε�
			ps.setString(1, dName); // �÷��� or ?���� = 1
			ps.setInt(2, deptno);
			
		// 3. ���� ����
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 4. ���� ����!!
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
		int result = updateDept(50, "�繫��", "");
		System.out.println(result);
		if(result > 0) {
			System.out.println(result + "�� �����Ǿ����ϴ�.");
		}else {
			System.out.println("���� ����!");
		}
	}
}
