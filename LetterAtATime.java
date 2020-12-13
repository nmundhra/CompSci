/*
 * LetterAtATime.java
 * 
 * Did you know that using a loop, you can examine a String one letter at a time? 
 * The two key built-in String methods are length() and charAt().
 * length() returns an int representing the total number of characters in the String (including punctuation and whitespace). 
 * For example, if the variable str contains the String "hello", then str.length() will return 5.
 * charAt( int n ) returns the  nth character (char) in the String. 
 * The character positions are zero-based, so if the variable str contains the String "ligature", then str.charAt(0) will return 'l', 
 * and  str.charAt(4) will return 't'.
 */
import java.util.Scanner;

public class LetterAtATime {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your message? ");
		String msg = keyboard.nextLine();
		int len = msg.length();
		
		System.out.println("Your message is " + len + " characters long.");
		System.out.println("The first character is at position 0 and is '" + msg.charAt(0) + "'.");
		System.out.println("The last character is at position " + (len - 1) + " and is '" + msg.charAt(len-1) + "'.");
		
		System.out.println("\nHere are all the characters, one at a time: ");
		for (int n = 0; n < len; n++ )
		{
			System.out.println( n + " - '" + msg.charAt(n) + "'" );
		}
	}
}

