package encapsulation;


public class CardBean3 {
	private String name1,name2;
	private int card1,card2;
	
	public void setCard1() {
		this.card1 = (int) ((Math.random()*13)+1);  // 1부터 13까지의 정수 중에서 랜덤 숫자를 리턴
	}
	public void setCard2() {
		this.card2 = (int) ((Math.random()*13)+1);
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getwinner() {
		String winner = "" ;
		if (card1 > card2) {
			winner = "승자 : "+name1;
		} else if (card1 < card2) {
			winner = "승자 : "+name2;
		} else {
			winner = "동점";
		}
		return winner;
	}
	@Override
	public String toString() {
		return "["+name1+" : "+card1+"]\tvs\t["+this.name2+" : "
					+card2+"]\n"+this.getwinner() ;
	}
}
