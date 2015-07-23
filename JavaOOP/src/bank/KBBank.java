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
			bankbook.showAccount();
		}
		System.out.println("검색하려는 계좌번호 : ");
				
		bank.searchAccountByAccountNo(scanner.next());
	}
}
