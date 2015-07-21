package abstraction;

public class ShiedRobot extends BasicBot{
	private int shieldPoint;
	
	public void shieldPoint(int shieldPoint) {
		this.shieldPoint = shieldPoint;
	}
	@Override
	public void status() {
		System.out.print("실드로봇\t");
		super.status();
		System.out.println("방어력 : "+this.shieldPoint);
	}
}
