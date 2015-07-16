package encapsulation;

public class Dice {
	private int num;
	public Dice(){
		this.num = (int) ((Math.random()*6)+1);		
	}
	public int getNum() {
		return num;
	}
}
