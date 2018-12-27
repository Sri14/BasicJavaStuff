package javaBasics;

public class IfElseCondition{

	public static void main(String[] args) {
		
		int a = 200;
		
		if(a >= 100){
			System.out.println("Entered value is is greater than 100 and entered value is "+ a);
		}else{
			System.out.println("Entered value is is less than 100 and entered value is "+ a);
		}
		
		int a1 = 500;
		int b1 = 200;
		int c1 = 300;
		
		if(a1>b1 & a1>c1){
			System.out.println("a1 is the greatest and value is "+ a1);
		}else if(b1>c1){
			System.out.println("b1 is the greatest and value is "+ b1);
		}else{
			System.out.println("c1 is the greatest and vaue is "+ c1);
		}

	}

}
