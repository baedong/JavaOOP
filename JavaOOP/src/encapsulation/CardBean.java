package encapsulation;


public class CardBean {
	//======= field
	private String name1,name2;
	private int card1,card2;
	//======= constructor
	//생성자 위치는 (멤버)필드와 메소드 영역 사이에 위치
	//생성자 모양 - public 클래스이름(){}
	public CardBean(){}
	// 디폴트 생성자 - 디폴트생성자는 개발자가 직접만들지 않아도 프로그램 내부에서는 생성되 있는것으로 인식한다
	// 이것을 사용하는 이유는 new 키워드를 통한 객체생성 역활뿐 아니라 생성과 동시에 값을 할당하는 기능을 추가시키기위함
	public CardBean(String name) {
		//setter 역활을 겸용하는 생성자
		this.name1 = name;
		this.card1 = (int) ((Math.random()*13)+1);
	}
	
	
	//======= method

	public String getName1() {
		return name1;
	}
	public int getCard1() {
		return card1;
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
