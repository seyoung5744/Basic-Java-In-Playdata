package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connExam {
	public static void main(String[] args) {
		
		// ��ũ��ġ�� �ܼ��� �̿��ؼ� db�� �����߾���.
		// ex) mysql -u test -p
		// ���̵� ��й�ȣ �� ������ �˷��ְ� DBMS�� �����Ѵ�.
		
		// 1. Connection ��ü�� ���� ���� ����!!
//  List list = new ArrayList<String>();
		
		// 0. ���� ������ �ڵ尡 �޸𸮿� �ö�;� �Ѵ�!! ����̹� �ε�!!
		// �޸𸮿� �÷����� �ϴ� ����� new �� class.forName()
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // �ش� Ŭ������ ���� ������ �ʱ⿡�� ���� ����
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null; // ���� ������ �ϰ� �ִ� ���� �츮�� ����ϴ� DBȸ�簡~~
		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // ���� ��ӵ� ������ ����. �� DBMS���� ���ݾ� ���̴� ������
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
