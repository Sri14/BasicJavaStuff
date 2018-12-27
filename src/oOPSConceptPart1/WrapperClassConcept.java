package oOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String s="100";
		System.out.println(s+100); // prints 100100
		
		//to convert this in to int we use wrapper class
		
				int i = Integer.parseInt(s); 
				System.out.println(i+100); // 200
	
		//to convert int to String
				
				int x=100;
				System.out.println(x+10); //110
				String y = String.valueOf(x);
				System.out.println(y+10); //10010
	
		//to convert String to Double
				
				String a = "100.50";
				double b = Double.parseDouble(a);
				System.out.println(b+10); //110.50
	
	}

}
