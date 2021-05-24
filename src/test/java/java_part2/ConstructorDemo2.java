package java_part2;

public class ConstructorDemo2 {

	// default constructor
	public ConstructorDemo2() {
		System.out.println(" I am in the constructor");
		System.out.println(" I am in the constructor lecture 1");
	}

	// Parameterized constructor
	public ConstructorDemo2(int a, int b) {
		System.out.println(" I am in the parameterized constructor");
		int c = a + b;
		System.out.println(c);
	}

	public ConstructorDemo2(String str) {
		System.out.println(str);
	}

	public ConstructorDemo2(float f) {

		System.out.println(f);
	}

	public ConstructorDemo2(double d) {

		System.out.println(d);
	}

	public void getdata() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo2 cd = new ConstructorDemo2();
		ConstructorDemo2 cds = new ConstructorDemo2("hello");
		ConstructorDemo2 c = new ConstructorDemo2(4, 5);
		ConstructorDemo2 f = new ConstructorDemo2(5);
		ConstructorDemo2 d = new ConstructorDemo2(6);
		// compiler will call implict constructor if you have not defined constructor
		// block
		// when ever you create an object constructor is called //block of code when
		// ever an object is created }

	}

}
