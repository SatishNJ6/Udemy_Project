package java_part2;

public class thisKeyword {

	int a = 5; // global variable, scope of the var will be at class level

	public static void main(String[] args) {
		thisKeyword tk = new thisKeyword();
		tk.getData();
	}

	public void getData() {
		int a = 6; // local variable, scope of the var will be only to this method
		System.out.println(a);
		System.out.println(this.a); // this keyword refers to current obj, class variable, bringing class var to
									// method by using this
		int b = this.a + a; // interview que - how to sum global and local variable
		System.out.println(b);

	}

}
