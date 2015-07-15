package encapsulation;


public class CardBean2 {
	private String name1,name2;
	private int card1,card2;
	
	public void setCard1(int card1) {
		this.card1 = card1;
	}
	public int getCard1() {
		return card1;
	}
	public void setCard2(int card2) {
		this.card2 = card2;
	}
	public int getCard2() {
		return card2;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName1() {
		return name1;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName2() {
		return name2;
	}
	public int getwin() {
		int win = 0 ;
		if (card1 > card2) {
			win = card1;
		} else {
			win = card2;
		}
		return win;
	}
	public String getwinner() {
		String winner = "" ;
		if (card1 > card2) {
			winner = name1;
		} else {
			winner = name2;
		}
		return winner;
	}
	@Override
	public String toString() {
		return "["+this.getName1()+" : "+this.getCard1()+"]\tvs\t["+this.getName2()+" : "
					+this.getCard2()+"]\n승자\t"+this.getwinner()+" : "+this.getwin() ;
	}
}
