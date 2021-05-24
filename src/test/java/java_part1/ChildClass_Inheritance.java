package java_part1;

public class ChildClass_Inheritance extends ParentClass_Inheritance {

	String name = "QAClickAcademy";

	public ChildClass_Inheritance() {
		super();// this should be always be at first line
		System.out.println("child class construtor");

	}

	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {

		ChildClass_Inheritance cd = new ChildClass_Inheritance();

		cd.getStringdata();
		cd.getData();
	}

}
