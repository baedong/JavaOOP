package encapsulation;

public class CardGame {
	//생성자 단축키 ctrl + space
	private String winner;
	
	public CardGame() {} // 디폴트 생성자
	
	public CardGame(CardBean bean1, CardBean bean2) {
			String winner = "";
			if (bean1.getCard1() > bean2.getCard1()) {
				winner = "승자 : "+bean1.getName1();
			} else if (bean1.getCard1() < bean2.getCard1()) {
				winner = "승자 : "+bean2.getName1();
			} else {
				winner = "동점";
			}
			this.winner=winner;
	}
	public String getWinner() {
		return winner;
	}
}
