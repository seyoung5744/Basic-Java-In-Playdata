package jdbc_exam;

public class DBTest {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		EmpDTO empDto = new EmpDTO();
		
		empDto.setEmpNo(5144);
		empDto.seteName("zzz");
		empDto.setJob("sd");
		empDto.setMgr(5123);
		empDto.setSal(1560);
		empDto.setComm(100);
		empDto.setDeptNo(20);
		
		dao.insertEmp(empDto);
	}
}
