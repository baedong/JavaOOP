package inhebitance;

import java.util.Scanner;

public class CelPhoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CelPhone nokia = new CelPhone();
		
		nokia.setCompany("노키아 휴대전화");
		System.out.println("전화 걸 사람 : ");
		nokia.setCall(scanner.next());
		nokia.setPortable(true);
		//boolean 타입의 set 메소드를 이용하여 setMove 를 자동 설정하게 하고
		//출력은 isPoratble() 이 아니라 getMove() 를 호출하게 하는 패턴
		System.out.println(nokia.getCompany()+"를 사용해서...\n"+nokia.getMove()+"\n"+nokia.getCall());
	}
}
