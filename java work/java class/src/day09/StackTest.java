package day09;

import java.util.Formatter;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack);
		
//		System.out.println(stack.pop());
		
		System.out.println(stack);
		
//		System.out.println(stack.get(0));
		
//		stack.add(0,"f");
		
		System.out.println(stack);
		
		System.out.println(stack.search("b"));
		System.out.println(stack.search("a"));
		System.out.println(stack.search("c"));
		java.util.Formatter f = new java.util.Formatter(new StringBuffer());
		

	}

}
