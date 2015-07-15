package encapsulation;

public class PayBean {
	// 메소드는 선언부, 연산부, 출력부 로 나눔
	// Bean 클래스라면 멤버필드 + 멤버메소드 로 나눔
	
	//멤버필드
	private String name;
	private int salary;
	
	//멤버메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public int getTax() {
		int tax=0;
		tax = (int) (salary * 0.1);
		return tax;
	}
	/*
	 * this 는 이 클래스 내부에 있는 ~~~ 의미
	 */
	public int getMoney() {
		int money=0;
		money = salary - this.getTax();
		return money;
	}
	
	
	@Override
	public String toString() {
		return "["+this.name+" 실급여]\n월급 : "+this.salary+" 만원\n세금 : "+this.getTax()+" 만원\n실급여 : "+this.getMoney()+" 만원";
	}
	
}
