package bank;

import java.util.LinkedList;

public class Bank {
	private final static String openTime = "09시00분"; // 오픈 시간(6) 
	private final static String closeTime = "16시00분"; // 마감 시간
	
	private String branchMaster; // 지정장명(고유id)
	private String branchName; // 지점명
	private String bankAddress; // 은행 주소
	private int budget; // 은행 총 예산

	
	// https://coding-factory.tistory.com/552 (자바 linked list)
	LinkedList<Customer> customerArray = new LinkedList<Customer>(); // 고객(배열)
//	employeeArray(직원(배열)
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
	public void removeCustomer(String customerName) {
		for(int i = 0; i < customerArray.size(); i++) {
			
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
//			NormalConsulting normalConsulting = new NormalConsulting();
			break;
		case 2:
			// 금융 상담 객체 생성
//			FinanceConsulting financeConsulting = new FinanceConsulting();
			break;
		default:
			System.out.println("잘못 된 메뉴입니다.");
		}
	}
}
