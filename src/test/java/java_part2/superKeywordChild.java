package java_part2;

public class superKeywordChild extends superKeywordParent {

	String name = "Reddy";

	public superKeywordChild() {
		super(); // this should be always be at first line
		System.out.println("child class constructor");

	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name); // super keyword refers to parent class, it is used to call parent class
										// variables, objs and methods and constructors
	}

	public void getData() {

		System.out.println("I am in child class");
		super.getData(); // refering to parent class method
	}

	public static void main(String[] args) {
		superKeywordChild skc = new superKeywordChild();
		skc.getStringData();
		skc.getData();
	}

}
