package oOPSConceptPart1;

public class Practice {
	
	int Wheels;
	String Model;
 
	
	public static void main(String[] args) {
		
		Practice obj = new Practice();
		
		obj.Wheels =4;
		obj.Model="BMW";
		
		System.out.println(obj.Model);
		System.out.println(obj.Wheels);		
		
		int a = obj.division(10, 2);
		System.out.println(a);
		int b = obj.pqr();	
		System.out.println(b);
		String c = obj.qa();
		System.out.println(c);
	}
	
	public String qa(){
		System.out.println("This is a qa method");
		String s = "Selenium";
		return s;
	}
	
	public int pqr(){
		System.out.println("This is a pqr method");
		int a =10;
		int b =20;
		int c = a+b;
		
		return c;
	}
	
	public int division(int x, int y){
		System.out.println("This is a division method");
		int z =x/y;
		 return z;
	}
}
