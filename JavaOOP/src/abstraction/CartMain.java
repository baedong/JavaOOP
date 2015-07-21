package abstraction;

public class CartMain {
	public static void main(String[] args) {
		Tv samsungTv = new Tv();
		samsungTv.writeInfo("삼성","와드TV","123-456","42","LED");
		Notebook LgNotebook = new Notebook();
		LgNotebook.writeInfo("LG","그램","456-789","듀얼코어","8G","500GB");
		
		/*
		 * 생성자를 사용하지 않는 인터페이스라도 타입으로 사용하기 위해 배열을 선언하는 것은 가능하다
		 */
		Product[] cart = new Product[2];
		//인터페이스를 사용하는 이유 2
		//	- 타입으로 통합을 해야하는 클래스들의 집합이 필요한 상황에서 각각의 클래스를 하나의 컬렉션에 담는 역활
		cart[0] = samsungTv;
		cart[1] = LgNotebook;
		//배열을 출력할때는 무조건 for-loop 인데
		// 카트 내부에 있는 객체를 선언해야 할 필요가 존재
		// 이상황에서는 확장된 for 문이 있는데 그걸 사용함
		
		//for(인터페이스타입 인스턴스 : 배열){}
		for(Product product : cart){
			product.showInfo();
		}
	}
}
