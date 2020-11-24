package day06;

public class DBUser {
	public static  DBUtilInter dBCreate() {
		return new CaramiDB();
	}

	public static void main(String[] args) {
		DBUtilInter db = DBUser.dBCreate(); 
		
		db.dBConn();
		db.dBExec();
		
		db.optionMethod();
		
//		CaramiDB caramidb = new CaramiDB();
//		caramidb.dBConn();
//		caramidb.dBExec();
		
		MySqlDB mysqlDB = new MySqlDB();
		mysqlDB.dBConn();
		mysqlDB.dBExec();
		
		
	}

}
