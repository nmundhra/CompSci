/*
 * SimpleFileInput.java
 * 
 * Start by creating a text file in Notepad (or Textpad) containing your first and last name, separated by whitespace. 
 * Save it as "name.txt".
 * Then write a program that opens that file and displays the two names on the screen, with no input from the keyboard.
 * Then try changing the name in the file, saving it again, and running the program again with no changes to confirm that it works.
 * 
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SimpleFileInput {
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader inputStream = null;
		
		try {
			inputStream = new BufferedReader (new FileReader("name.txt"));
			String l;
			while ((l = inputStream.readLine()) != null)
			{
				System.out.println("Your name is :" + l);
			}
		} finally {
			if (inputStream != null)
			{
				inputStream.close();
			}
		}
	}
}

