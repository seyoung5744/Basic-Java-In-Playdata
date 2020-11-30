package day10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectStreamExam02 {

	public static void main(String[] args) {
		try(
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
				){
			List<String> list = (List<String>)ois.readObject();
			for (String string : list) {
				System.out.println(string);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
