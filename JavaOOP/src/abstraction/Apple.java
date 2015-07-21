package abstraction;

public class Apple implements FruitsInterface{

	@Override
	public void display(String str) {
		System.out.println(str+"사과 입니다");
	}

}
