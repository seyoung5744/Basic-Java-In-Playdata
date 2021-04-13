package day09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class IOExam01 {
	// ������ main���� ������ �ȵ�. main���� ������ JVM���� ó���϶�� �ǵ� �̰� ����ó�� ���ϰڴ� ��.
	public static void main(String[] args) throws Exception{ 
		// Ű����� ���� �� �� �Է� �ް� �;�~~
		// Ű���� -  System.in
		// ����~?�� �Է¹޴� ����� �ֳ�??? BufferedReader - readLine()
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br = new BufferedReader(new FileReader("src/day09/Box.java"));
		
		String line = br.readLine();
		
		System.out.println(line); // �ݼֿ� ���
		
		// ���Ͽ� ����ϰ� �ʹ�.
		
		FileWriter fw = new FileWriter("BoxCopy.txt");
		
		fw.write(line);
		
		fw.close(); // ���� - �� �ݾƾ� �̶� �ü���� �ν��� �ؼ� �۾��� ����. ��, ������ ���� �۾��� �ü���� ������ �켱 ���� ������ ���� �̷�״ٰ� close�� ������ ����
	}
}
