package encapsulation;

public class Account {
	private String name;
	private int num;
	public Account(String name) {
		this.name = name;
		num = (int) ((Math.random()*9)+1);
	}
}
