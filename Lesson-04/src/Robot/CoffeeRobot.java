package Robot;

public class CoffeeRobot extends Robot {

	public CoffeeRobot(String name, String doingWork) {
		super(name, doingWork);
		this.name = name;
		this.doingWork = doingWork;
		
	}

	public CoffeeRobot() {
		
	}

	@Override
	public String toString() {
		return "CoffeeRobot [name=" + name + ", doingWork=" + doingWork + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	
	

}
