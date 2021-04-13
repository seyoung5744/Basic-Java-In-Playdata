package jdbc_exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DAO�� ������ ���̺�� �ϳ�
public class DeptDAO {
	// �̷��� ����, statement ��ü�� �������� �����صθ� �ȵ�. ��, ��θ� �ϳ� �����ΰ� �װ� �����ؼ� ����ϴ� ��
	// connect�� ������ �۾����� �����־� ��.
	//
	// ���� ����� ����� Ǯ�� ����� �ΰ� �̿��ϴ°�. ��, �߰� �ܰ踦 �ΰ� ���.
	// => �� �ϳ� �Ҷ����� DB�� connect�� �ϸ� ��� ����� ���� ������ �̸� �����صΰ� �ű⿡�� �Ҵ�޾� ���.

	// ���� �ڵ忡�� DB�� ���� �����ϴ� �ڵ尡 �ߺ��Ǽ� �����ϴ�...�׷��� DBUtil�̶�� ���� �и�.
	
	private Connection conn = null;
	private PreparedStatement ps = null;
//
//	public void insertDept(int deptno, String dname, String loc) {
//		// 1. DB���� Connection ��ü�� ���´�.
//		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // ���� ��ӵ� ������ ����. �� DBMS���� ���ݾ� ���̴� ������
//		String user = "testuser";
//		String password = "won9975744!";
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//
//		// 2. ���� �ۼ�
//			String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
//			ps = conn.prepareStatement(sql);
//			
//			// ���� ���� ���ε�
//			ps.setInt(1, deptno);
//			ps.setString(2, dname);
//			ps.setString(3, loc); // query ���� �����ΰ� ������ ���� ����
//
//		// 3. ���� ����
//			count = ps.executeUpdate();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//		// 4. ���� ����!!
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
//		// 1. DB���� Connection ��ü�� ���´�.
//		String url = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC"; // ���� ��ӵ� ������ ����. �� DBMS���� ���ݾ� ���̴� ������
//		String user = "testuser";
//		String password = "won9975744!";
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(url, user, password);
//
//		// 2. ���� �ۼ�
//			String sql = "update dept set dname = ? where deptno = ?";
//			ps = conn.prepareStatement(sql);
//			// ���� ���� ���ε�
//			ps.setString(1, dname); // �÷��� or ?���� = 1
//			ps.setInt(2, deptno);
//
//		// 3. ���� ����
//			count = ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//		// 4. ���� ����!!
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
	 * DBUtil ����� ������� �ڵ�
	 */
	
	public void insertDept(int deptno, String dname, String loc) {
		PreparedStatement ps = null;
		try {
		// 1. DB���� Connection ��ü�� ���´�.
			conn = DBUtil.getConnection();

		// 2. ���� �ۼ�
			String sql = "insert into dept(deptno, dname, loc) values (?,?,?)";
			ps = conn.prepareStatement(sql);
			
			// ���� ���� ���ε�
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc); // query ���� �����ΰ� ������ ���� ����

		// 3. ���� ����
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		// 4. ���� ����!!
			DBUtil.close(conn, ps);
		}
	}

	public int updateDept(int deptno, String dname, String loc) {
		PreparedStatement ps = null;
		int count = 0;
		try {
		// 1. DB���� Connection ��ü�� ���´�.
			conn = DBUtil.getConnection();
		// 2. ���� �ۼ�
			String sql = "update dept set dname = ? loc = ?where deptno = ?";
			ps = conn.prepareStatement(sql);
			// ���� ���� ���ε�
			ps.setString(1, dname); // �÷��� or ?���� = 1
			ps.setString(2, loc);
			ps.setInt(3, deptno);

		// 3. ���� ����
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		// 4. ���� ����!!
			DBUtil.close(conn, ps);
		}
		
		return count;
	}
}
