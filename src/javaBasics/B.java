package javaBasics;

public class B extends A {

	public B() {
		super();
	}

	public B(int i) {
		super(i);
	}

	public B(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(20);
		B obj2 = new B(30, 40);
	}

}
