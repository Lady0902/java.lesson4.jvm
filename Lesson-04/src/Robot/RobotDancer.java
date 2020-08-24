package Robot;

public class RobotDancer extends Robot {

	public RobotDancer(String name, String doingWork) {
		super(name, doingWork);
		this.name = name;
		this.doingWork = doingWork;
	}

	public RobotDancer() {
		
	}

	@Override
	public String toString() {
		return "RobotDancer []";
	}
	

}
