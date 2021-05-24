package java_part2;

// final means restricting access
final class finalKeyword { // if we mark class as final,we cannot (extend)inherit parent class objs

	final void getData() { // if we mark method as final, we cannot override the method to child class from
							// parent
		System.out.println("Ashwini");
	}

	public static void main(String[] args) {
		final int i = 5; // the value cannot be changed if we declare var as final(constant vars)

	}

}
