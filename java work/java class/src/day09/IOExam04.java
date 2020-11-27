package day09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExam04 {
//파일로부터 읽어서 파일에 쓰는 것을 구현해보세요.  (메소드로 도출해보세요...  )   
	public static void fileCopy2(String inputFile, String outputFile) {
		int n;
		byte[] b = new byte[1024];
		try(
				FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile);
		){
			while((n = fis.read(b)) != -1) {
				fos.write(b, 0, n);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void fileCopy(String inputFile, String outputFile) {
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(outputFile);
			br = new BufferedReader(new FileReader(inputFile));
			String line = null;
			while((line = br.readLine())!= null) {
				fw.write(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		fileCopy("C:/data/java/Java_sunnyvale.pdf", "src/day09/TEST2.txt");
		long endTime = System.currentTimeMillis();
		System.out.println("총 걸린 시간 : "+ (endTime-startTime));
		
		startTime = System.currentTimeMillis();
		fileCopy2("C:/data/java/Java_sunnyvale.pdf", "src/day09/TEST1.txt");
		endTime = System.currentTimeMillis();
		
		System.out.println("총 걸린 시간 : "+ (endTime-startTime));
	}

}
