package oOPSConceptPart1;

public class LocalVariableVsGlobal {

	// global variables
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i= 30; // local variable - scope of i is only in main method
		System.out.println(i);
		
		// to use a global variable create an object of the class and can be used through out the program 
		LocalVariableVsGlobal obj = new LocalVariableVsGlobal();
		System.out.println(obj.age);
		System.out.println(obj.name);

		}
	
		public void sum(){ // local variables - Scope of i is only in sum function
			int i=10;
			int x=20;
			
		System.out.println(i);
		System.out.println(x);

	}

}
