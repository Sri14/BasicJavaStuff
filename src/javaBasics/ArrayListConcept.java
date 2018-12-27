package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept { //array list is dynamic 

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList(); // no size need to be defined
		
		
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size());
		ar.add(400); //3
		ar.add(500); //4
		System.out.println(ar.size());
		// can add String, int, double, char
		ar.add("The"); //5
		ar.add("a"); //6
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		for(int a=0; a<ar.size();a++){
			System.out.println(ar.get(a));
		}
		
		//if we want to restrict particular data type for arraylist
		
		ArrayList<Integer> ar1 = new ArrayList();
		
		ar1.add(299);
		ar1.add(300);
		
	}

}
