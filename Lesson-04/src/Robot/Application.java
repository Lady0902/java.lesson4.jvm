package Robot;

public class Application {

	public static void main(String[] args) {
		Robot robot1 = new Robot();
		System.out.println("robot1 - просто працюю");
		CoffeeRobot robot2 = new CoffeeRobot();
		System.out.println("robot2 - я варю каву");
		RobotCooker robot3 = new RobotCooker();
		System.out.println("robot3 - я просто готую");
		RobotDancer robot4 = new RobotDancer();
		System.out.println("robot4 - я просто танцюю");
	}
}
