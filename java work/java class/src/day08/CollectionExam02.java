package day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Book{
	String title;
	Book(String title){
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title;
	}
}
public class CollectionExam02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		
		System.out.println(set);
		
		Set<Book> bookSet = new HashSet<>();
		bookSet.add(new Book("java"));
		bookSet.add(new Book("Mysql"));
		bookSet.add(new Book("servlet"));
		bookSet.add(new Book("java"));
		System.out.println(bookSet); // 순서 유지 X
		
		Iterator<Book> itr = bookSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Book book : bookSet) {
			System.out.println(book);
		}
	}
}
