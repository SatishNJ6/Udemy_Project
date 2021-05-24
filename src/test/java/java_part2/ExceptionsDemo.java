package java_part2;

//one try can be followed by multiple catch blocks 
//catch should be an immediate block after try 
// only in one case finally block fails - if we forcibly stop jvm during execution of the program
//finally - (in automation this is used basically for closing browser and deleting cookies)

// refer this link for definitions - https://www.javatpoint.com/exception-handling-in-java
public class ExceptionsDemo {
	public static void main(String[] args) {
		int b = 7;
		int c = 0;
		try {
			// purchased fail
			int k = b / c;

			System.out.println(k);
		} catch (ArithmeticException et) { // only catches Arithmetic Exception
			System.out.println("I catched the Arthimetic/exception");
		}

		try {
			int arr[] = new int[5];
			System.out.println(arr[7]);
		}

		catch (IndexOutOfBoundsException ets) { // only catches ArrayIndexBound/exception
			System.out.println("I catched the IndexBound/exception");
		} catch (Exception e) { // this block is like global, catches all exceptions
			// retry again
			System.out.println("I catched the error/exception");
		} finally {
			System.out.println("delete cookies");// THis block is executed irrespective of
			// exception thrown or not
		}

	}

}
