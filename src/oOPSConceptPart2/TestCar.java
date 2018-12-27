package oOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism --- compile - time polymorphism
		
		BMW b = new BMW();
		b.start(); // prints from BMW class as BMW overrides start method from its parent class
		b.stop();
		b.theftsafe();
		b.refuel();
		b.theftsafe();
		b.engine();
		// Both Car and BMW methods/functions can be called using static polymorphisim
		
		
		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
	
		System.out.println("**********");

		// child class object can be refereed by parent class reference variable.
		Car c1 = new BMW(); // dynamic polymorphism -- run time polymorphisim 
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		//c1.theftsafe can not be called as only parent and shared methods/functions can be called using dynamic polymorphism
		// this is also called as Top Casting
		
		//Down Casting will throw an run time error ClassCastException 
		// BMW b1 = (BMW)new Car();
		
	}

}
