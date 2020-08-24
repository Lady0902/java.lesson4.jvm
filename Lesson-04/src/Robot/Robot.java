package Robot;

public class Robot {
	public String name;
	public String doingWork;
	public Robot(String name, String doingWork) {
		this.name = name;
		this.doingWork = doingWork;	
	
	}
	public Robot() {
		
	}
	@Override
	public String toString() {
		return "Robot [name=" + name + ", doingWork=" + doingWork + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	}
	

