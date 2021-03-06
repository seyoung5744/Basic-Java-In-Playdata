package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Bank {
	Scanner sc = new Scanner(System.in);
	private final static String openTime = "09시00분"; // 오픈 시간(6) 
	private final static String closeTime = "16시00분"; // 마감 시간
	
	private String branchMaster; // 지정장명(고유id)
	private String branchName; // 지점명
	private String bankAddress; // 은행 주소
	private int budget; // 은행 총 예산
	Set<Integer> giveNum = new HashSet<>(); // 대기번호
	
	// https://coding-factory.tistory.com/552 (자바 linked list)
	// 이 배열안에 고객이 있으면 = 은행에서 업무를 보고 있는거고, 지워지면 = 업무 끝나고 은행에서 나간거
	LinkedList<Customer> customerArray = new LinkedList<Customer>(); // 고객(배열)
	
//	bankBookArray(통장들(배열)
//	transactionHistoryArray(거래내역(배열)
	
	// 총 예산 get
	public int getBudget() { return this.budget; }
	
	// 총 예산 set
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	// 고객 배열에 요소 삽입 - 고객이 은행 업무 진행 시 배열에 삽입.
	public void setCustomer(Customer customer) {
		this.customerArray.add(customer);
	}
	
	// 고객 요소 삭제 - 고객 은행 업무가 끝나면 고객 배열에서 삭제
	public void removeCustomer(Customer customer) {
		// 이 배열에서 고객을 찾을 건데
		// equals을 오버라이드하면 이름, 생년월일로 객체 비교를 비교 부탁드려요
		for(int i = 0; i < customerArray.size(); i++) {
//			customerArray.get(i).equals(customer);
		}
	}
	// 은행 오픈 시간 출력
	public void open() {
		System.out.println("은행 오픈 시간 : " + openTime);
	}
	
	// 은행 총 예산 출력
	public void budgetSelect() {
		System.out.println("총 예산 : " + getBudget());
	}
	
	// 거래 내역 조회 - 하루 은행이 담당했던 거래 내역 출력
	public void transactionHistorySelect() {
		
	}
	
	// 상담 요청 ( 1. 일반 상담  2. 금융 상담 )
	public void consulting(int menu) {
		switch(menu) {
		case 1:
			// 일반 상담 객체 생성
			System.out.println("일반 상담 진행~~");
//			NormalConsulting normalConsulting = new NormalConsulting();
//			normalConsulting.start();
			break;
		case 2:
			System.out.println("금융 상담 진행~~");
			// 금융 상담 객체 생성
//			FinanceConsulting financeConsulting = new FinanceConsulting();
//			financeConsulting.start();
			// 상담에 대한 구체적인 생성한 상담 클래스에서 진행.
			break;
		default:
			System.out.println("잘못 된 메뉴입니다.");
		}
	}
	
	public void giveNum() {
//		while (set.size() < 5) {a
		int d = (int) (Math.random() * 10) + 1; // 1~10사이
		giveNum.add(d);

		System.out.println("대기번호 : " + d);
		System.out.println(giveNum);
//		}
//		List<Integer> list = new ArrayList<>(set);
//		Collections.sort(list);
//		System.out.println(list);

	}
}
