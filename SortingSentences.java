/*
 * SortingSentences.java
 * 
 * Write a program that creates an ArrayList of Strings. Let the user type in a sentence using keyboard.nextLine(). 
 * Using String.split(), break up the sentence into an array of Strings and then put those Strings into an ArrayList. 
 * Also, force all the Strings to lowercase.
 * Then, using the String ArrayList sorting function you already wrote, put the words in alphabetical order and print them out again.
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SortingSentences {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Sentence: ");
		String sen = keyboard.nextLine();
		
		String[] words = sen.toLowerCase().split(" ");
		ArrayList<String> list = new ArrayList<String>();
		
		for (String item : words)
			list.add(item);
			
		SortingAnArrayListOfStrings.sortArrayList(list);
		System.out.println("ArrayList: " + list);
	}
}
