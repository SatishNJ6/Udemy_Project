package java_part1;

public class StringManipulations {

	// 1. String class and their methods
	public static void main(String[] args) {

		String s = " java/trainig";
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("t"));
		System.out.println(s.substring(3, 6));
		System.out.println(s.substring(6));
		System.out.println(s.concat("rahul teaches"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String[] split = s.split("/");
		System.out.println(split[0]);
		System.out.println(split[1]);

		System.out.println(s.length());

		System.out.println(s.trim());

		System.out.println(s.replace("i", "j"));

	}

}
