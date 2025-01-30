/**
 * 
 */
package errors;



/**
 * 
 */
public class FirstErrorsThursdayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			int num1, num2, ans;

			num1 = 9;
			num2 = 0;

			ans = num1 / num2;
			System.out.println(ans);
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Maths error");
			
			//developer info
			System.out.println(arithmeticException.getMessage());
			System.out.println(arithmeticException.toString());
			arithmeticException.printStackTrace();
			
		} catch (Exception exception) {
			System.out.println("something bad happened");
		}
		
		
//		Scanner scanner = new Scanner(System.in);
//		int answer;
//		System.out.println("Enter a number");
//		try { 
//		answer = scanner.nextInt();
//		System.out.println("Nice number that one "+answer);
//		} catch (Exception exception) {
//			System.out.println("Invalid input");
//		
//		}
//		scanner.close();
		
		
		
		
		
		
//		try {
//		int[] myA = { 3, 5, 6, 7 };
//
//		for (int loop = 0; loop < 5; loop++) {
//			System.out.println(myA[loop]);
//		}
//		}catch (Exception exception) {
//			System.out.println("Sorry, issue occurred");
//		}
//		
//		System.out.println("finish");
//	}
//	
	
	}	
	
}
