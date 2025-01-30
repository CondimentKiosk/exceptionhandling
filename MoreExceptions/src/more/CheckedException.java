/**
 * 
 */
package more;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 
 */
public class CheckedException {

	public static void main(String[] args) {
		CheckedException checkedException = new CheckedException();
		try {
			checkedException.iAmChecked();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("In main : problem with file");
		}

	}

	public void iAmChecked() throws FileNotFoundException {

		FileReader fileReader = new FileReader("nofile.text");

	}
}
