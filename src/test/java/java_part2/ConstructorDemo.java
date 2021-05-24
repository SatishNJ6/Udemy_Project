package java_part2;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("constructor line 1");
		System.out.println("constructor line 2");
	}

	public static void main(String[] args) {
		// Constructor executes a block of code when ever object is created for a class
		// Constructor will not return values
		// Constructor name should be always same as Class name
		// whenever we create object, Constructor is called
		// compiler will call default Constructor if we not defined any Constructor
		// block

		ConstructorDemo cd = new ConstructorDemo();

	}

}
