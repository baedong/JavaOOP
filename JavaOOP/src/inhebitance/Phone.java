package inhebitance;

public class Phone {
	private String company;
	private String call;
	
	
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call +"에게 전화를 검";
	}
}
