package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExam {
	public static void main(String[] args) throws Exception {
		// 0. ����̹� �ε�. (���� ������ Ŭ������ �޸𸮿� �ø���.)
		Class.forName("com.mysql.cj.jdbc.Driver"); // DB ȸ��, DB ������ ���� �ٸ���.
		
		// 1. DB���� Connection ��ü�� ������ �ȴ�.
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // ���� ��ӵ� ������ ����. �� DBMS���� ���ݾ� ���̴� ������
		String user = "testuser";
		String password = "won9975744!";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		// 2. ������ �ۼ� Statement ��ü�� ���´�.
		String deptName = "�λ���";
		String loc = "���ʱ� ���ʵ�";
		String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql); 
		ps.setInt(1, 50);
		ps.setString(2, deptName);
		ps.setString(3, loc); // query ���� �����ΰ� ������ ���� ����
		
		
		// 3. ����!!
		int count = ps.executeUpdate(); // insert, update, delete���� ��� ���, return int
		if(count > 0) {
			System.out.println(count + "�� �Է� ����!!");
		}else {
			System.out.println("�Է� ����!!");
		}
//		ps.executeQuery(); // ���̺��� ���;� �Ҷ� ���. return ResultSet
		
		// 3. ��� �Ŀ� db���ῡ�� ���� ������ �ݴ�� close
		ps.close(); 
		conn.close();
		
		
	}
}
