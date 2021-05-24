package my_practice;

import java.util.Arrays;

public class SortString {
//asked in KGISL interview - not answered
	public static void main(String[] args) {
		String s = "3120211";

		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
	}

}
