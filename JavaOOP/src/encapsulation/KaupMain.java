package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		String name = "", msg = "";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; // 카우푸인덱스
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		name = scanner.next();
		System.out.println("키 입력 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게 입력 : ");
		weight = scanner.nextDouble();
		
		// 2015.07.14 카우푸계산기
		KaupBean4 kaupbean = new KaupBean4();
		kaupbean.setName(name);
		kaupbean.setHeight(height);
		kaupbean.setWeight(weight);
		kaupbean.getIndex();
		
		System.out.println(kaupbean.toString());
	}
}
