package javaBasics;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		String x[][] = new String [3][5];
		
		System.out.println(x.length); //3 - Total number of rows
		System.out.println(x[0].length); //5 -- Total number of columns in row 0
		
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		x[0][4]="e";
		
		x[1][0]="a1";
		x[1][1]="b1";
		x[1][2]="c1";
		x[1][3]="d1";
		x[1][4]="e1";
		
		x[2][0]="a2";
		x[2][1]="b2";
		x[2][2]="c2";
		x[2][3]="d2";
		x[2][4]="e2";
	
		System.out.println(x[0][2]);
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		
		//print all values of two dimensional array write 2 for loops.
		
		for(int row=0; row<x.length;row++){
			for(int col=0; col<x[0].length;col++){
				System.out.println(x[row][col]);
			}
		}
		
		
		String a[][]= new String [3][4];
		a[0][0]="A";
		a[0][1]="B";
		a[0][2]="C";
		a[0][3]="D";
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int row=0; row<a.length;row++){
			for(int col=0; col<a[0].length;col++){
				System.out.println(a[row][col]);
			}
		}
	}

}
