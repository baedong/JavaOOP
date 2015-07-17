package abstraction;
/* 
 * @ date : 2015-07-07
 * @ author : me
 * @ story : 인터페이스를 통한 추상화 구현
 */
public interface Account {
	/*
	 * 추상메소드 (abstract method) : {}바디가 없는메소드
	 * 구상메소드 (concrete method) : {}바디를 가지는메소드
	 * 
	 * 추상메소드를 만드는 이유
	 * 	- 액션으로 이뤄진 개념들은 개발자에 따라, 혹은 해석하는 사람에 따라 달라지므로 아웃라인(메소드이름, 파라미터 타입, 갯수)를
	 *    정해서 인터페이스에 있는 기능은 반드시 구현하라는 암묵의 지시사항(프로그래머에게 제약을 준다)
	 */
	public void withdraw(int money);
	public void deposit(int money);
}
