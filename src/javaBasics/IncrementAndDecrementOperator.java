package javaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		int i=1;
		int j=i++; // port increment
		
		System.out.println(i); //2 value of i is added with 1 below.
		System.out.println(j); //1 value of i is assigned to j so it is 1 and i is added with 1 so it is 2
		
		int m=1;
		int n=++m;// pre increment
		System.out.println(m); //2 value of m is added with 1 below
		System.out.println(n); //2 value of m is added first and assigned to n so it is 2 

		int a=2;
		int b=a--; //post decrement
		System.out.println(a); //1 values of a is decreased by 1 below 
		System.out.println(b); //2 value of a is assigned to b first so it is 2
		
		int p=2;
		int q=--p; // pre decrement
		System.out.println(p);//1 value of p is decreased by 1 so it is 1
		System.out.println(q);//1 value is p is decreased by 1 and assigned to q so it is 1
		
	}

}
