package java_part1;

public class ArraySmallestNumber {

	public static void main(String[] args) {

		int[][] abc = { { 2, 3, 6 }, { 5, 8, 4 }, { 0, 1, 6 } };
		int min = abc[0][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (abc[i][j] < min) {

					min = abc[i][j];
				}
			}
		}
		System.out.println(min);
	}
}