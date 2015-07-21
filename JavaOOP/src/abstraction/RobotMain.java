package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 * GunRobot
		 * ShiedRobot
		 * 
		 * 출력
		 * 건로봇은 속도 10, 에너지 10, 공격력 50
		 * - 공격력은 인스턴스 변수로 int attackPoint
		 * 실드로봇은 속도 20, 에너지 20, 방어력 50
		 * - 방어력은 인스턴스 변수로 int shieldPoint
		 */
		GunRobot gunRobot = new GunRobot();
		gunRobot.charge(10);
		gunRobot.run(10);
		gunRobot.attackPoint(50);
		ShiedRobot shiedRobot = new ShiedRobot();
		shiedRobot.charge(20);
		shiedRobot.run(20);
		shiedRobot.shieldPoint(50);
		
		Robot[] robot = new Robot[2];
		robot[0] = gunRobot;
		robot[1] = shiedRobot;
		
		for(Robot rb : robot){
			rb.status();
		}
	}
}
