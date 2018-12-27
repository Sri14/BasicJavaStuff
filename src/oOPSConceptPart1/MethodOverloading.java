package oOPSConceptPart1;
public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);	
		}
	// we can also overload main method - in real life we don't normally do it
	public static void main(int a){	
	}
	public static void main(int a, double b){	
	}
	//can not create method inside a method
	//duplicate method - same method with same parameters/arguments and data types are not allowed
	//method overloading - when the method name is same with different parameters/input arguments with different data types in the same class
	public void sum(){ // not input parameters
		System.out.println("sum method");
	}
	public void sum(int a){ // 1 input parameter
		System.out.println("sum method with one input parameter");
		System.out.println(a);
	}
	public void sum(int b, int c){ // 2 input parameters
		System.out.println("sum method with two input parameters");
		int a= b+c;
		System.out.println(a);
	}

}
