package ua.lviv.lgs.animal;

public class Application {
	

	public static void main(String[] args) {
		Animal a1 = new Animal("Leopard", 20, 7);
		String name = a1.getName();
		Double speed = a1.getSpeed();
		int age = a1.getAge();
		Animal a2 = new Animal("Bull", 2, 14);
		String name2 = a2.getName();
		Double speed2 = a2.getSpeed();
		int age2 = a2.getAge();
		
		System.out.println("Animal name = " + name + ", Animal speed = " + speed + " kmph, Animal age = " + age + " years");
		System.out.println("Animal name2 = " + name2 + ", Animal speed2 = " + speed2 + " kmph, Animal age2 = " + age2 + " years");
		
	}	 
	
	
}
