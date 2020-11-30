package day10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectStreamExam4 {

	public static void main(String[] args) {
		try(
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.txt"));
				){
			List<Phone> list = (List<Phone>)ois.readObject();
			for (Phone phone : list) {
				System.out.println(phone);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
