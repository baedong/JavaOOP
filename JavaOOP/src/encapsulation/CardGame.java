package encapsulation;

public class CardGame {
	
	private String winner, looser;
	private int winScore, looseScore;
	//생성자 단축키 ctrl + space
	 // 디폴트 생성자
	public CardGame() {}
	public CardGame(CardBean bean1, CardBean bean2) {
		//지역변수(로컬변수) = 메모리영역 스택에 저장
		//인스턴스변수 = 메모리영역 힙에 저장
		if (bean1.getCard1() > bean2.getCard1()) {
				this.winner = "승리 : "+bean1.getName1();
				this.looser = "패배 : "+bean2.getName1();
				this.winScore = bean1.getCard1();
				this.looseScore = bean2.getCard1();
			} else if (bean1.getCard1() < bean2.getCard1()) {
				this.winner = "승리 : "+bean2.getName1();
				this.looser = "패배 : "+bean1.getName1();
				this.winScore = bean2.getCard1();
				this.looseScore = bean1.getCard1();
			} else {
				this.winner = "동점 : "+bean1.getName1();
				this.looser = "동점 : "+bean2.getName1();
				this.winScore = bean1.getCard1();
				this.looseScore = bean2.getCard1();
			}
	}
	@Override
	public String toString() {
		return winner+"\n점수 : "+winScore+"\n"+looser+"\n점수 : "+looseScore;
	}
}
