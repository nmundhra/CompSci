/*
 * LittlePuzzle.java
 * 
 * Open a file specified by the user. This file will contain a bunch of characters. 
 * You should read in each character from the file, one character at a time. Display every third character on the screen. 
 * Throw the other characters away.
 */
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class LittlePuzzle {
	
	public static void main (String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		DataInputStream inputStream = null;
		
		System.out.print("Which file to open: ");
		String fileName = keyboard.next();
		
		try {
			inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
			
			char c;
			int r;
			int d = 0;
			String s = "";
			while((r = inputStream.read()) != -1)
			{
				c = (char) r;
				d++;
				
				if (d % 3 == 0)
					System.out.print(c);
				else
					s = s + c;
			}
			System.out.format("%n%n%s",s);
		} catch(EOFException e){ 
			
			}	
	}
}

