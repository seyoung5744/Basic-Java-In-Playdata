package day09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class IOExam01 {
	// 원래는 main에서 던지며 안됨. main에서 던지면 JVM한테 처리하라는 건데 이건 예외처리 안하겠단 뜻.
	public static void main(String[] args) throws Exception{ 
		// 키보드로 부터 한 줄 입력 받고 싶어~~
		// 키보드 -  System.in
		// 한줄~?을 입력받는 기능이 있나??? BufferedReader - readLine()
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br = new BufferedReader(new FileReader("src/day09/Box.java"));
		
		String line = br.readLine();
		
		System.out.println(line); // 콜솔에 출력
		
		// 파일에 출력하고 싶다.
		
		FileWriter fw = new FileWriter("BoxCopy.txt");
		
		fw.write(line);
		
		fw.close(); // 주의 - 꼭 닫아야 이때 운영체제가 인식을 해서 작업을 진행. 즉, 실제로 쓰는 작업은 운영체제가 하지만 우선 순위 조정을 위해 미뤄뒀다가 close를 만나면 수행
	}
}
