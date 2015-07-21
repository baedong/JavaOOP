package abstraction;

public class Notebook extends ProductSpec{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void writeInfo(String company, String name, String serialNo,String cpu,String ram,String hdd) {
		super.writeInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("CPU : "+this.cpu);
		System.out.println("RAM : "+this.ram);
		System.out.println("HDD : "+this.hdd);
	}
}
