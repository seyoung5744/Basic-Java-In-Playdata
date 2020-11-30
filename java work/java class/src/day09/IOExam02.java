package day09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class IOExam02 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("src/day09/IOExam01.java"));
		
		String line = null;
		
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
	
		
	}
}
