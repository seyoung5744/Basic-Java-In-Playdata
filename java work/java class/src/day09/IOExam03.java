package day09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExam03 {
	public static void main(String[] args) {
		int bt;
		int count = 0;
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.dat");
			//-1�� �ƽ�Ű�� ��� -1�� �Ѿ���� ��
			while((bt = System.in.read()) != -1) { 
//				System.out.println((char)bt);		
				fw.write((char)bt);
				
				count++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("�� �Է¹���Ʈ �� : " + count);
	}
}