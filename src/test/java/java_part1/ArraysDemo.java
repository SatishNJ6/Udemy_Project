package java_part1;

public class ArraysDemo {

	public static void main(String[] args) {

		/*
		 * int a; a=4;
		 */

		// - Array is a container which stores multiple values of same data type

		int a[] = new int[5];// Declares an array and allocates memory for the values
		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12;// initialized values into that array

		int b[] = { 1, 4, 3, 5, 7, 8 };

		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");

			// retrieve values present in this array/
		}

	}

}
