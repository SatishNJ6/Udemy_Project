package java_part2;

//Ex: census report gathering

// - static vs non-static
//A static method belongs to the class itself while a non-static method belongs to each instance of a class. 
//Therefore, a static method can be called directly without creating any instance of the class and an object 
//is needed to call a non-static method
public class StaticVariable {

	String name; // instance variables
	String address;
	static String city = "Bangalore"; // class variables - to save memory in heap, we define like this, city is common
	// for all

	static {
		city = "Chennai"; // static block to define static variables
	}

	StaticVariable(String name, String address) {
		this.name = name; // assigning instance variables to local variables
		this.address = address;

	}

	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable("Nihit", "Marathalli");
		StaticVariable sv1 = new StaticVariable("Reddy", "KR Puram");
		sv.getData();
		sv1.getData();
		StaticVariable.getCity();

	}

	public void getData() {

		System.out.println(name + " " + address + " " + city + "");
	}

	public static void getCity() { // static method - no need to create object
		System.out.println(city);
	}

}
