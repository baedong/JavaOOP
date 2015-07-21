package abstraction;

public class GunRobot extends BasicBot{
	private int attackPoint;
	
	public void attackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	@Override
	public void status() {
		System.out.print("건로봇\t\t");
		super.status();
		System.out.println("공격력 : "+this.attackPoint);
		
	}
}
