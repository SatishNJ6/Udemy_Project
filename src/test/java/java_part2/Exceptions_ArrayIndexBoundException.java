package java_part2;

public class Exceptions_ArrayIndexBoundException {

	public static void main(String[] args) {

		try {
			int[] a = new int[3];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;

			System.out.println(a[3]); // ArrayIndexboundofexception
		} catch (Exception e) {
			System.out.println("I catched the exception");
		}

	}

}
