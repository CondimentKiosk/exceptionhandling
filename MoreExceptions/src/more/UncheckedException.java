/**
 * 
 */
package more;

/**
 * 
 */
public class UncheckedException {
	
	public static void main(String[] args) {
		try {
		UncheckedException uncheckedException = new UncheckedException();
	
		uncheckedException.checkNumber(0);
		} catch (ArithmeticException e) {
			System.out.println("Problem with number input");
		}
	}

	/**
	 * 
	 * @param i
	 * @throws ArithmeticException if a zero
	 */
	private void checkNumber(int i) throws ArithmeticException {
		if (i ==0) {
			throw new ArithmeticException("A zero");
		}
		
		
	}
}
