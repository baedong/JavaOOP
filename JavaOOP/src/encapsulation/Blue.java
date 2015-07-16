package encapsulation;

public class Blue {
	private int num;
	
	public Blue() {}
	public Blue(Dice dice1,Dice dice2){
		this.num= dice1.getNum()+dice2.getNum() ;
	}
	
	@Override
	public String toString() {
		return "두 주사위의 합이 "+this.num+"이니 "+this.num+"칸 전진";
	}
}
