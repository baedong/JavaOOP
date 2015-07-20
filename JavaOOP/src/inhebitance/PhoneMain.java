package inhebitance;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone phone = new Phone();
		
		phone.setCompany("삼성 가정용 전화기");
		System.out.println("전화 걸 사람 : ");
		phone.setCall(scanner.next());
		System.out.println(phone.getCompany()+"를 사용해서...");
		System.out.println(phone.getCall());
	}
}
