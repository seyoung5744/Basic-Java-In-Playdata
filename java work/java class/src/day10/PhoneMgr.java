package day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PhoneMgr {
	// count 만큼 전화번호를 입력받는 기능을 작성. (IO 이용)
	// 이름, 전화번호를 입력 받음
	// 입력 받은 파일 명으로 파일에 저장
	// ex ) 원세영 : 010 - 111- 1111
	public static void inputPhone(int count, String fileName) {
		String name, phoneNum;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				PrintWriter pw = new PrintWriter(fileName))
		{
			for(int i = 0; i < count; i++) {
				System.out.print("이름 : ");
				name = br.readLine();
				System.out.print("전화전호 : ");
				phoneNum = br.readLine();
				
				pw.println(name + " : " + phoneNum);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	// 매개 변수로 입력받은 파일명에 해당하는 파일을 읽어서 출력하세요.
	public static void printPhoneList(String fileName) {
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// 파일을 읽어서, 읽은 내용으로 Phone객체를 생상하고, Phone객체를 List에 담아서 반환.
	public static List<Phone> getPhoneList(String fileName){
		List<Phone> phoneList = new ArrayList<>();
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while((line = br.readLine()) != null) {
				String[] txt = line.split(":");
				Phone phone = new Phone(txt[0].trim(), txt[1].trim());
				
				phoneList.add(phone);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return phoneList;
	}
	public static void main(String[] args) {
//		inputPhone(1, "test.txt");
		printPhoneList("test.txt");
		
		List<Phone> list = getPhoneList("test.txt");
		for(Phone p : list) {
			System.out.println(p);
		}
	}
}
