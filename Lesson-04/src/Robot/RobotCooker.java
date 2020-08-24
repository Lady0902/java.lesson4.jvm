package Robot;

public class RobotCooker extends Robot {
	public RobotCooker(String name, String doingWork) {
		super(name, doingWork);
		this.name = name;
		this.doingWork = doingWork;
		
	}

	public RobotCooker() {
		
	}

	@Override
	public String toString() {
		return "RobotCooker []";
	}
}
