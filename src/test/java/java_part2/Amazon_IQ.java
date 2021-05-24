package java_part2;

import java.util.ArrayList;

public class Amazon_IQ {

	// printing unique number in Array
	public static void main(String[] args) {

		int a[] = { 4, 5, 5, 9, 4, 7, 6, 7, 6, 6, 5 };

		// Print unique number from the list- Amazon
		// print the string in reverse

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}

				}

				if (k == 1)
					System.out.println(a[i] + " is unique number");

				// System.out.println(a[i]);
				// System.out.println(k);
			}
		}
	}
}
