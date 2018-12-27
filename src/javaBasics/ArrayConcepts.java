package javaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {

		// int array
		
		int i[]=new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[3]);
		System.out.println(i.length); //size of array
		
		//print all the values of array - use for loop
		
		for(int x=0; x<i.length; x++){
			System.out.println(i[x]);
		}
		
		String name[] = new String[4];
		
		name[0]="My";
		name[1]="Name";
		name[2]="is";
		name[3]="Sri";
		
		System.out.println(name[3]);
		
		for(int j=0; j<name.length; j++){
			System.out.println(name[j]);
		}
		
		//Object Array  - Object is a class----is used to store different data types values
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1995";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for(int d=0; d<ob.length; d++){
			System.out.println(ob[d]);
		}
		
		
		
		
	}

}
