/**
 * 
 */
package errors;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class AgeCheckerWithInputMismatchExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int age = askForAge();
			System.out.println("You are " + age);
			if (age > 60) {
				System.out.println("That's so old !");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public static int askForAge() {
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		boolean validInput = false; //flag

		while (!validInput) {
			try {
				System.out.println("Age ?");
				age = scanner.nextInt();
				validInput = true;

			} catch (InputMismatchException e) {
				System.out.println("Try again !");
				scanner.nextLine(); // flush the scanner
			}

		}

		scanner.close();
		return age;
	}
}
