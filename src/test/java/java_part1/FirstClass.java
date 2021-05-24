package java_part1;

//1. writing first executable program in java
//2. Usage of Methods in java
//3. Importance of classes and objects in java
public class FirstClass {

	static int a = 6;

	public int getData() { // if return tpye is like return "Satish", data type should be String before
							// method name
		System.out.println("I am in a first method");
		return 6;

	}

	public static void main(String args[]) { // we cant declare methods inside a main, always it should be outside of
												// main

		System.out.print("Nihit");
		System.out.println("Reddy");

		// objects are the references/instances of a class
		FirstClass fc = new FirstClass();
		fc.getData();
		System.out.println(a);

		SecondClass sc = new SecondClass();
		sc.setData();

	}

}
