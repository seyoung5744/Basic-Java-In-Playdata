package day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PhoneMgr {
	// count ��ŭ ��ȭ��ȣ�� �Է¹޴� ����� �ۼ�. (IO �̿�)
	// �̸�, ��ȭ��ȣ�� �Է� ����
	// �Է� ���� ���� ������ ���Ͽ� ����
	// ex ) ������ : 010 - 111- 1111
	public static void inputPhone(int count, String fileName) {
		String name, phoneNum;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				PrintWriter pw = new PrintWriter(fileName))
		{
			for(int i = 0; i < count; i++) {
				System.out.print("�̸� : ");
				name = br.readLine();
				System.out.print("��ȭ��ȣ : ");
				phoneNum = br.readLine();
				
				pw.println(name + " : " + phoneNum);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	// �Ű� ������ �Է¹��� ���ϸ��� �ش��ϴ� ������ �о ����ϼ���.
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
	
	// ������ �о, ���� �������� Phone��ü�� �����ϰ�, Phone��ü�� List�� ��Ƽ� ��ȯ.
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