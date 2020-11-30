package day10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExam3 {
	public static void main(String[] args) {
		List<Phone> phoneList = new ArrayList<Phone>();
		phoneList.add(new Phone("kang","010-111-1111"));
		phoneList.add(new Phone("kim","010-222-2222"));
		phoneList.add(new Phone("hong","010-333-3333"));
		
		try(
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.txt"));	
					){
				oos.writeObject(phoneList);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
