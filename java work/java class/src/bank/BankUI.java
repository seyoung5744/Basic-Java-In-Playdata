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
			System.out.print("\n1.회원가입    2.로그인    3.상담     4.거래    5.대기번호 출력    6. 종료 : ");
			int menu = sc.nextInt();

			if (menu == 6) {
				System.out.println("종료~~");
				break;
			}
			
			switch (menu) {
			case 1:
				System.out.println("회원 가입~~");
				break;
			case 2:
				System.out.println("로그인쓰");
				System.out.println("관리자 계정이면 직원/ 고객 생성할 예정.");
				break;
			case 3:
				System.out.println("1. 일반 상담 2. 금융 상담");
				int menu2 = sc.nextInt();
				bank.consulting(menu2);
				break;
			case 4:
				System.out.println("거래");
				break;
			case 5:
				bank.giveNum();
				System.out.println("대기번호 출력~");
				break;
			default:
				System.out.println("메뉴 없");
				break;

				
			}
		}
	}
}
