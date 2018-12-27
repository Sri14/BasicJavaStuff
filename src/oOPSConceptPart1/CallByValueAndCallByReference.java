package oOPSConceptPart1;


public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		
		int x = 10;
		int y = 20;
		int d = obj.testSum(x, y); //this is called -  call by value  or pass by value
		System.out.println(d);
		
		obj.p=30;
		obj.q=40;
		// before swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		obj.swap(obj); // passed the object reference - obj 
		// after swap
		System.out.println(obj.p); 
		System.out.println(obj.q);
		
	}
	
	public int testSum(int a , int b){
		int c = a+b;
		return c;
	}

	public void swap(CallByValueAndCallByReference t){ // this is called - call by reference or pass by reference 
		int temp;
		temp = t.p; // temp will be 30
		t.p = t.q; // t.p will be 40
		t.q = temp; // t.q will be 30
	}
	
	
	
}
