package Java_basics;

public class ParentClass {

	public static void main(String[] args) {

		System.out.println("I Navigated to home page");

		MethodsClass mc = new MethodsClass(); // 'new' is a memory allocation operator, it creates memory for
												// MethodsClass in parent class
		// Classobject.methodname
		System.out.println(mc.validateHeader());

	}

}
