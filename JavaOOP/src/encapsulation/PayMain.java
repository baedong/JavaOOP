package encapsulation;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 * [오더]
		 * pay 프로그램은 월급을 입력 받아서 세금을 떼고 실급여를 고객에게 알려주는 프로그램
		 * 세율은 10% 
		 * 출력문
		 * [홍길동 실급여]
		 * 월급 : 100 만원
		 * 세금 : 10 만원
		 * 실급여 : 90 만원
		 */
		int salary=0,tax=0,money=0;
		String name = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		name = scanner.next(); 
		System.out.println("월급 입력 : ");
		salary = scanner.nextInt();
		
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setSalary(salary);
		System.out.println(payBean.getName()+"님 반갑습니다");
		System.out.println(payBean.toString());
	}
}
