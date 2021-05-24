package java_part1;

public class ArrayLargestNumber {

	public static void main(String[] args) {

		int[][] abc = { { 2, 3, 6 }, { 5, 8, 4 }, { 9, 1, 6 } };
		int max = abc[0][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (abc[i][j] > max) {

					max = abc[i][j];
				}
			}
		}
		System.out.println(max);
	}
}