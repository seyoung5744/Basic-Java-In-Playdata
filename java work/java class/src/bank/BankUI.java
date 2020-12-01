package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BankUI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();

		bank.open();

		while (true) {
			System.out.print("\n1.ȸ������    2.�α���    3.���     4.�ŷ�    5.����ȣ ���    6. ���� : ");
			int menu = sc.nextInt();

			if (menu == 6) {
				System.out.println("����~~");
				break;
			}
			
			switch (menu) {
			case 1:
				System.out.println("ȸ�� ����~~");
				break;
			case 2:
				System.out.println("�α��ξ�");
				System.out.println("������ �����̸� ����/ ���� ������ ����.");
				break;
			case 3:
				System.out.println("1. �Ϲ� ��� 2. ���� ���");
				int menu2 = sc.nextInt();
				bank.consulting(menu2);
				break;
			case 4:
				System.out.println("�ŷ�");
				break;
			case 5:
				bank.giveNum();
				System.out.println("����ȣ ���~");
				break;
			default:
				System.out.println("�޴� ��");
				break;

				
			}
		}
	}
}