package oOPSConceptPart1;

public class StaticAndNonStatic {

	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		System.out.println(age); // static global variable can be called directly
		sum(); // static method can be called directly
		System.out.println(StaticAndNonStatic.age); // static global variable can be called by class
		StaticAndNonStatic.sum(); // static method can be called by class
		
		StaticAndNonStatic obj = new StaticAndNonStatic();  // need to create a new object for calling non static methods
		obj.SendMail();  // new object for calling non static methods
		System.out.println(obj.name); // new object for calling non static global variable
		

	}
	
	public void SendMail(){ // non static method
		System.out.println("sendmail method");
		System.out.println(age);

		
	}
	
	public static void sum(){ // static method
		System.out.println("sum method");
	}

}
