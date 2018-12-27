package oOPSConceptPart1;

public class Car {

	int mod;
	int wheel;
	public static void main(String[] args) {
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		//new Car() is the Object of Car class
		// a, b, c are the Object reference variables
		// new key word creates the object
		
		a.mod = 2015;
		a.wheel = 4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		b.mod = 2016;
		b.wheel = 4;
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		c.mod = 2017;
		c.wheel = 4;
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		c.mod=2018;
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
	}

}
