/**
 * 
 */
package more;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class TryResources {
	public static void main(String[] args) {
		TryResources tryResouces = new TryResources();
		tryResouces.readFromFile();

	}
	
	public void readFromFile() {
		
		
		try (Scanner scanner = new Scanner(System.in);) { 
			int userNumber, answer;
			System.out.println("Enter number ");
			userNumber = scanner.nextInt();
			answer = 66/ userNumber;
			System.out.println("Answer "+answer);
			
		} catch (InputMismatchException  | ArithmeticException e) {
			System.out.println(e.toString());
		}
	}
}
