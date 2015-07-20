package inhebitance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Iphone iphone = new Iphone();
													 // Iphone.BRAND
		iphone.setCompany(Iphone.BRAND+" 휴대전화"); // 클래스명.필드명..get/set 없이 사용하는 이유는 은닉화가 필요없는 고정된값이기 떄문
		iphone.setPortable(Iphone.TRUE);
		System.out.println("통화 상대 입력 : ");
		String name = scanner.next();
		System.out.println("보내는 메세지 입력 : ");
		iphone.setData(name,scanner.next());
		
		System.out.println(iphone.getCompany()+"를 사용해서...\n"+iphone.getMove()+"\n"+iphone.getData());
	}
}
