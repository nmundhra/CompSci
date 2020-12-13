/*
 * DisplayingAFile.java
 * 
 * Ask the user for the name of a file to open. Open that file, and display the entire contents of the file on the screen.
 * You must do this a line at a time using nextLine() and a loop that checks hasNext().
 * 
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DisplayingAFile {
	
	public static void main (String[] args) throws IOException {
		
		Scanner inputStream = null;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("open which files: ");
		String fileName = keyboard.next();
		
		try {
			inputStream = new Scanner(new BufferedReader(new FileReader(fileName)));
			String l;
			while (inputStream.hasNext())
			{
				l = inputStream.nextLine();
				System.out.println(l);
				
			}
		} finally {
			if (inputStream != null)
			{
				inputStream.close();
			}
		}
	}
}

