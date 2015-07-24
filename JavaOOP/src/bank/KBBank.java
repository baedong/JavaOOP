package bank;

import java.util.Scanner;

public class KBBank {
	public static void main(String[] args) {
		BankRole bank = new Bank(100);
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객님 성함 : ");
		String ownerName = scanner.next();
		System.out.println("비번4자리 : ");
		int password = scanner.nextInt();
		System.out.println("입금 : ");
		int restMoney = scanner.nextInt();
		bank.openAccount(ownerName, password, restMoney);
		
		System.out.println("==== 계좌번호 조회(계좌번호) ====");
		System.out.println("검색하려는 고객 : ");
		String searchName = scanner.next();
		int searchCount = bank.searchCountByname(searchName);
		BankBook[] searchArr = new BankBook[searchCount];
		searchArr = bank.searchAccountByname(searchName);
		for (BankBook bankbook : searchArr) {
			System.out.println(bankbook.showAccount());
		}
		System.out.println("검색하려는 계좌번호 : ");
		//객체가 메소드를 호출한 후 연산을 통해 결과를 리턴하였지만
		//그 리턴값을 받는 변수처리는 개발자가 별도로 해줘야 한다
		//그 방법은 메소드가 리턴하는 리턴타입을 알아내서 그타입으로 변수 하나를 만든 다음 그변수에 리턴값을 할당한다.
		BankBook bankbook = bank.searchAccountByAccountNo(scanner.next());
		System.out.println(bankbook.showAccount());
		System.out.println("삭제하려는 계좌번호 : ");
		String delet = scanner.next(); 
		boolean closeOk = bank.closeAccount(scanner.next());
		if (closeOk==true) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당 계좌가 없습니다.");
		}
		
	}
}
