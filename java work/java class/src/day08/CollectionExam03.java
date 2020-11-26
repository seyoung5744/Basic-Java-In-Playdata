package day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionExam03 {
	public static void main(String[] args) {
		Map<String, Student> student = new HashMap<>();
		
		student.put("kang", new Student("kang"));
		student.put("kim", new Student("kim"));
		student.put("hong", new Student("hone"));
		student.put("kang2", new Student("kang2"));
		System.out.println(student);
		
		System.out.println(student.get("kang"));
		
		Set<String> keys = student.keySet();
		
		for(String key : keys) {
			System.out.println(key);
		}
	}
}
