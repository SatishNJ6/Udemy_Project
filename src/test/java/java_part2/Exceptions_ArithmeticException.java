package java_part2;

public class Exceptions_ArithmeticException {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 0;

		try {
			int d = b / c;
			System.out.println(d);
		} catch (Exception e) {
			System.out.println("I catched the exception");
		}

	}

}
