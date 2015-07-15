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
		int card1=0,card2=0;
		String name1 = "", name2= "";
		System.out.println("1번째 이름 입력 : ");
		name1 = scanner.next();
		System.out.println("2번째 이름 입력 : ");
		name2 = scanner.next();
		
		CardBean hong = new CardBean(name1);
		CardBean kim = new CardBean(name2);
		
		CardGame game = new CardGame(hong,kim);
		System.out.println(game.getWinner());
	}
}
