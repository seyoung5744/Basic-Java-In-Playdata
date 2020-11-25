package bank;

import java.util.LinkedList;

public class Bank {
	private final static String openTime = "09��00��"; // ���� �ð�(6) 
	private final static String closeTime = "16��00��"; // ���� �ð�
	
	private String branchMaster; // �������(����id)
	private String branchName; // ������
	private String bankAddress; // ���� �ּ�
	private int budget; // ���� �� ����

	
	// https://coding-factory.tistory.com/552 (�ڹ� linked list)
	// �� �迭�ȿ� ������ ������ = ���࿡�� ������ ���� �ִ°Ű�, �������� = ���� ������ ���࿡�� ������
	LinkedList<Customer> customerArray = new LinkedList<Customer>(); // ����(�迭)
	
//	employeeArray(����(�迭)
//	bankBookArray(�����(�迭)
//	transactionHistoryArray(�ŷ�����(�迭)
	
	// �� ���� get
	public int getBudget() { return this.budget; }
	
	// �� ���� set
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	// ���� �迭�� ��� ���� - ������ ���� ���� ���� �� �迭�� ����.
	public void setCustomer(Customer customer) {
		this.customerArray.add(customer);
	}
	
	// ���� ��� ���� - ���� ���� ������ ������ ���� �迭���� ����
	public void removeCustomer(Customer customer) {
		// �� �迭���� ������ ã�� �ǵ�
		// equals�� �������̵��ϸ� �̸�, ������Ϸ� ��ü �񱳸� �� ��Ź�����
		for(int i = 0; i < customerArray.size(); i++) {
//			customerArray.get(i).equals(customer);
		}
	}
	// ���� ���� �ð� ���
	public void open() {
		System.out.println("���� ���� �ð� : " + openTime);
	}
	
	// ���� �� ���� ���
	public void budgetSelect() {
		System.out.println("�� ���� : " + getBudget());
	}
	
	// �ŷ� ���� ��ȸ - �Ϸ� ������ ����ߴ� �ŷ� ���� ���
	public void transactionHistorySelect() {
		
	}
	
	// ��� ��û ( 1. �Ϲ� ���  2. ���� ��� )
	public void consulting(int menu) {
		switch(menu) {
		case 1:
			// �Ϲ� ��� ��ü ����
//			NormalConsulting normalConsulting = new NormalConsulting();
//			normalConsulting.start();
			break;
		case 2:
			// ���� ��� ��ü ����
//			FinanceConsulting financeConsulting = new FinanceConsulting();
//			financeConsulting.start();
			// ��㿡 ���� ��ü���� ������ ��� Ŭ�������� ����.
			break;
		default:
			System.out.println("�߸� �� �޴��Դϴ�.");
		}
	}
}