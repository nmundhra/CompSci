/*
 * VowelCapitalization.java
 * 
 * Open a file specified by the user. Read in each line from the file, one at a time. 
 * Then use charAt() and a loop to process that line one character at a time.
 * If the character is a consonant, simply display it as-is on the screen. 
 * If the character is a lower-case vowel (a,e,i,o,u), display it as a CAPITAL LETTER instead. This is going to take some if statements.
 * You can try the sample input file vowels.txt to see what your program does. You could also test it on any other file you like.
 */
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.util.Scanner;

public class VowelCapitalization {
	
	public static void main (String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		DataInputStream inputStream = null;
		
		System.out.print("Which file to open: ");
		String fileName = keyboard.next();
		
		try {
			inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
			String line;
			char c;
			while((line = inputStream.readLine()) != null)
			{
				for (int i=0;i<line.length();i++)
				{
					if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' ||
						line.charAt(i) == 'o' || line.charAt(i) == 'u')
					{
						System.out.print(Character.toUpperCase(line.charAt(i)));
					}
					else
					{
						System.out.print(line.charAt(i));
					}
				}
				System.out.println();
			}	
		} catch (EOFException e) {
			
		}
	}
}

