/**
 * 
 */
package errors;

/**
 * 
 */
public class MethodCallStepInto {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int num1, num2, result;
		num1 = 10;
		num2 = 30;

		result = adder(num1, num2);
		System.out.println(result);

	}

	private static int adder(int num1, int num2) {
		int answer = num1 - num2;
		return answer;
	}

}
