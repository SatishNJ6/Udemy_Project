package java_part1;

public class StringClassDemo {

	// 1. Two ways of defining string object -Imp in Interview point of view

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String: String is one of the pre-built class in java
		// a. String Literal - if the obj is already present in String pool, it ll not
		// create duplicate and points to the same reference variable - most preferable
		// in java
		// b. by creating obj of String(using new keyword) - if sb and sb1 reference
		// have same String name, it will create duplicate entries(explicitly forcing to
		// create an obj)

		String a = "Nihit";
		String b = "Nihit";
		String sb = new String("Bunny");
		String sb1 = new String("Bunny");

		System.out.println(a);
		System.out.println(b);
		System.out.println(sb);
		System.out.println(sb1);

	}

}
