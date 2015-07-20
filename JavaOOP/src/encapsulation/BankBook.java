package encapsulation;

import abstraction.Account;

/*
 * 객체지향프로그래밍에서 클래스는 현실세계를 그대로 카피하려고 한다
 * 그 대상이 구체적 물질이든 개념적 추이든 그대로 재현하려고 해야 한다
 * 통장을 이루는 요소를 생각, 그 요소가 결국 인스턴스 변수를 구성하게 된다
 * 1.은행이름 => 아이티뱅크 bank
 * 2.통장번호 => 5자리 랜덤숫자 bankbookNo
 * 3.소유자이름 => 스캐너로 입력받음 name
 * 4.날짜/예금/출금/잔액 => 스캐너로 입력받음 숫자 타입 money 
 * 5.비밀번호 => 스캐너로 입력받는 값 pass
 * 인터페이스
 * 1.withdraw(int money):void
 * 2.deposit(int money):void
 * [출력]
 * ================
 * [아이티뱅크]
 * 계좌번호 : 12345 
 * 이름 : 홍길동
 * 잔액 : 1000원
 * ================
 * 
 */
public class BankBook implements Account{
	// 상수 : final 을 붙여서 절대 불변의 값을 만듬
	// 스태틱 : final 을 뺴버리면 절대 불변의 값이 아니라 바꿀수 있지만, 고정된 값 스태틱 값이 된다.
	//			스태틱 = 클래스 변수 
	//			BankBook b = new BankBook();  b.bank = 인변이 값을 호출한것  BankBook.bank = 클래스변수 호출하는 모양
	// 위치 : 필드 = {인변,상수,클래스변수} < 멤변
	public static String BANK;
	private int bankbookNo;
	private String name;
	private String msg; // 유효성체크 결과를 알려줘서 고객이 실수로 입력했다면 공지해주는 기능
	private int money;
	private int pass;
	
	public BankBook(String name) {
		this.BANK="아이티뱅크"; 
		this.bankbookNo=(int) ((Math.random()*99999)+10000);
		this.name= name;
	}
	// getter setter 단축키 : ALT + SHIFT + S
	
	
	
	@Override
	public String toString() {
		return "================\n["+BANK+"]\n계좌번호 : "+bankbookNo+"\n이름 : "+name+"\n잔액 : "+money+"원\n================";
	}

	public int getBankbookNo() {
		return bankbookNo;
	}
	public String getName() {
		return name;
	}
	public int getPass() {
		return pass;
	}
	public int getMoney() {
		return money;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	@Override
	public void withdraw(int money) {
		//유효성체크 - 파라미터 값이 정상값이 아닌 상태를 추적해서 필터랑하는 로직
		if (money <=0) {
			msg = "출금액은 0보다 커야 합니다";
		} else if(this.money < money){
			msg = "출금액이 잔액보다 큽니다";
		} else{
			this.money -= money;
		}
	}
	@Override
	public void deposit(int money) {
		if (money <=0) {
			msg = "입금액은 0보다 커야 합니다";
		} else {
			this.money += money;
		}
	}
}

