package encapsulation;

import java.util.Scanner;

public class CardMain {
	public static void main(String[] args) {
		/*
		 * [오더]
		 * 카드 두장을 비교해서 카드 번호가 더 큰수가 이기는 게임프로그램을 작성하시오
		 * 프로토타입(시제품) 프로그램으로 개발자가 임의의 숫자를 입력하면
		 * 출력
		 * 홍길동 : 7
		 */
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("1번째 이름 입력 : ");
		CardBean hong = new CardBean(scanner.next());
		System.out.println("2번째 이름 입력 : ");
		CardBean kim = new CardBean(scanner.next());
		
		CardGame game = new CardGame(hong,kim);
		
		System.out.println(game.toString());
	}
}
