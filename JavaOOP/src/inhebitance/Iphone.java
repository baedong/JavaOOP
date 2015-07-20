package inhebitance;

public class Iphone extends CelPhone{
	private String data;
	private String os;
	public static boolean TRUE = true; // 오로지 이동전화만 만드는회사 (무조건 참)
	public static String BRAND = "아이폰"; // 브랜드를 static 이라는 키워드를 사용해서 클래스변수를 만들고 고정값으로 설정

	public String getData() {
		return data;
	}
	
	public void setData(String name,String data) {
		this.data = name+"에게, 메세지로 "+data+"를 전달";
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = "iOS";
	}
		
}
