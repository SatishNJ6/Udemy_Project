package java_part1;

public class Nested_For_Loops {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) { // (outer for loop -this block will loop for 4 times)
			System.out.println("outer loop started");

			for (int j = 1; j <= 4; j++) {
				System.out.println("inner loop started");
			}
			System.out.println("outer loop finished");
		}
	}
}
