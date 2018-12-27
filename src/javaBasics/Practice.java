package javaBasics;

public class Practice {

	int wheels;
	String model;
	
	
	public static void main(String[] args) {
		
	int a =1;
	while(a<=10){
		System.out.println(a);
		a++;
	}
	
	int b=10;
	for(int c=1; c<=b; c++){
		System.out.println(c);
	}
		
	int d=500;
	int e=400;
	int f=300;
	
	if(d>e & d>f){
		System.out.println("d is the greatest");
	}else if(e>f){
		System.out.println("e if the greatest");
	}else{
		System.out.println("f is the greatest");
	}
	
	String obj[]= new String[4];
	obj[0]="A";
	obj[1]="B";
	obj[2]="C";
	obj[3]="D";
	
	System.out.println(obj.length);
	
	for(int g=0; g<obj.length; g++){
		System.out.println(obj[g]);
	}
	
	String obj1[][]= new String [2][3];
	
	obj1[0][0]="A";
	obj1[0][1]="B";
	obj1[0][2]="C";
	
	obj1[1][0]="A1";
	obj1[1][1]="B1";
	obj1[1][2]="C1";
	
	System.out.println(obj1.length);
	System.out.println(obj1[0].length);
	
	for(int h=0; h<obj1.length; h++){
		for(int i=0; i<obj1[0].length; i++){
			System.out.println(obj1[h][i]);
		}
	}
	
	
	}

	


}
