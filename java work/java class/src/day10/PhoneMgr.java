package day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		
		
		// 데코레이터 패턴 
		// 수돗꼭지  - 파이프(물을 가져오죠), 수돗꼭지 - 물을 틀고 끄고,
		
		// System.in - 키보드로 입력한다.
		// System.in을 통하여 접근되는 객체는 자바 버추얼 머신이 메모리로 올라오면서 미리 객체를 생성해 놓는, 대표적인 객체이다. 자료형이 InputStream이기 때문에 바이트 단위로만 입출력이 허용된다.

		// InputStreamReader - 키보드로 입력할 것을 
		// InputStreamReader 는 바이트 스트림에서 문자 스트림으로,

		// BufferedReader 는 문자 입력 스트림으로부터 문자를 읽어 들이거나
		
		// 키보드로 입력하면 
		// 1. 입력한 것들이 바이트 단위로 변경된다. System.in
		// 2. 바이트 단위를 문자 단위로 - InputStreamReader
		// 3. 스트림에 있는 것들이 일단 다 버퍼로 가니깐. 버퍼에 있는 것 읽어들인다.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(fileName)) {
			
			
			for (int i = 0; i < count; i++) {
				System.out.print("이름 : ");
				name = br.readLine(); // read
				System.out.print("전화전호 : ");
				phoneNum = br.readLine();

				pw.println(name + " : " + phoneNum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 매개 변수로 입력받은 파일명에 해당하는 파일을 읽어서 출력하세요.
	public static void printPhoneList(String fileName) {
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 파일을 읽어서, 읽은 내용으로 Phone객체를 생상하고, Phone객체를 List에 담아서 반환.
	public static List<Phone> getPhoneList(String fileName) {
		List<Phone> phoneList = new ArrayList<>();
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((line = br.readLine()) != null) {
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
		for (Phone p : list) {
			System.out.println(p);
		}
	}

	// 입력받아서 리스트 객체로 저장
	public static void inputPhoneObject(int count, String fileName) {
		List<Phone> phoneList = new ArrayList<Phone>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				ObjectOutputStream pw = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
			for (int i = 0; i < count; i++) {
				System.out.println("이름을 입력하세요. ");
				String name = br.readLine();
				System.out.println("전화번호를 입력하세요. ");
				String phoneNumber = br.readLine();

				Phone phone = new Phone(name, phoneNumber);
				phoneList.add(phone);
			}
			pw.writeObject(phoneList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 객체로 저장된 파일을 읽어서 리스트로 반환
	public static List<Phone> getPhoneList2(String fileName) {
		List<Phone> list = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
			list = (List<Phone>) ois.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
