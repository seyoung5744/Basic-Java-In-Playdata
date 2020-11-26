package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


class Student{
	private String name;
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		System.out.println(System.identityHashCode(this));
		System.out.println(System.identityHashCode(obj));
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class CollectionExam01 {	
	public static void main(String[] args) {		
		// Array...
		
		
		String[] strArr = new String[3];
		strArr[0] = "kang";
		strArr[1] = "kim";
		strArr[2] = "hone";
		
		//strArr[3] = "lee";
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		for(String string : strArr) {
			System.out.println(string);
		}
		
		// Arraylist...
		List<String> list = new ArrayList<>(3);
		System.out.println(list.size());
		
		list.add("kang");
		list.add("kim");
		list.add("hong");
		System.out.println(list.size());
		
		list.add("lee");
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String string : list) {
			System.out.println(string);
		}
		
		list.remove(0);
		System.out.println(list);
		
		// Vector
		List<String> vector = new Vector<>();
		
		vector.add("kang");
		vector.add("kim");
		vector.add("hong");
		
		System.out.println(vector.get(0));
		
		
		// 클래스 list에 넣기
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("kang"));
		student.add(new Student("Kim"));
		
		System.out.println(student);
		
		System.out.println(student.contains(new Student("kang")));
		
		
		
	}
	
}
