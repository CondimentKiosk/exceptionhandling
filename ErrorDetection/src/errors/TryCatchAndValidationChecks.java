/**
 * 
 */
package errors;

/**
 * 
 */
public class TryCatchAndValidationChecks {

	/**
	 * @param args
	 */
	public static void showValue(int index) {

		int[] myArray = { 1, 2, 3, 4 };
		if (index >= myArray.length) {
			System.out.println("Sorry can't do that");
		} else {
			System.out.println(myArray[index]);
		}
	}

//	try {
//		int[] myArray = { 1, 2, 3, 4 };
//		System.out.println(myArray[index]);
//	} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
//		System.out.println("Out of bounds!");
//	}
//}

	public static void getValue() {
		int index = 7;
		showValue(index);
	}

	public static void main(String[] args) {
		try {
			System.out.println("Start");
			getValue();
			System.out.println("End");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}
