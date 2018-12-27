package javaBasics;

import java.util.ArrayList;
import java.util.Hashtable;

public class DailyPractice {
	
	static int a =300;
	static int b =400;

	public static void main(String[] args) {
		
		
		Hashtable ht = new Hashtable();
		
		ht.put("A", "Hello");
		ht.put(5, "Tom"); // can put a key as int and Value as String
		System.out.println(ht.get("A"));
		System.out.println(ht); // to print all values is hashtable

		int x= 400;
		int y =500;
		int z =300;
		
		if(x>y&x>z){
			System.out.println("x is the greatest");
		}else if(y>z){
			System.out.println("y is the greatest");
		}else{
			System.out.println("z is the greatest");
		}		
		
		int s = DailyPractice.division(10, 2);
		System.out.println(s);
		
		DailyPractice dp = new DailyPractice();
		int e = dp.addition(2, 3);
		System.out.println(e);
		
		System.out.println(dp.a);
		
		
		int a =1;
		while(a<=10){
			System.out.println(a);
			a++;
		}
		
		int c=10;
		for(int b=0;b<=c;b++){
			System.out.println(b);
		}
		
		ArrayList ar = new ArrayList();
		ar.add("Welcome");
		ar.add("To");
		ar.add("Java");
		ar.add(123);
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		for(int d =0; d<ar.size();d++){
			System.out.println(ar.get(d));
		}		
		
	}
	
	public int addition(int a, int b){
		int c=a+b;
		return c;
	}
	
	public static int division(int a, int b){
		int c=a/b;
		return c;
	}
	
	
}	
