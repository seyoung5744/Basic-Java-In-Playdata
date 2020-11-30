package day10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExam {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("kang");
		nameList.add("kim");
		nameList.add("hong");
		nameList.add("lee");
		
		
		try(
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));	
				){
			oos.writeObject(nameList);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
