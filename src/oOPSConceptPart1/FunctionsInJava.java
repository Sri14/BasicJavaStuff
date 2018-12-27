package oOPSConceptPart1;

public class FunctionsInJava {
	
	public static void main(String[] args) {	
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		int i = obj.pqr();
		System.out.println(i);
		String j = obj.qa();
		System.out.println(j);
		int k = obj.division(10, 2);
		System.out.println(k);
	
	}
	
	//non static methods
	
	//return type void - void does not return anything
	public void test(){ // no input and no output
		System.out.println("test method");
	}
	
	// return type is int
	public int pqr(){ // no input and some output
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	// return tyoe is String 
	public String qa(){ // not input - some output
		System.out.println("qa method");
		String s ="Selenium";
		return s;
	}
	
	//return type is int
	//x ,y are input parameters/arguments
	public int division(int x, int y){
		System.out.println("division menthod");
		int z=x/y;
		return z;
	}
	
}
