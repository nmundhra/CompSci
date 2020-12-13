/*
 * GradesInAnArrayAndAFile.java
 * 
 * Prompt the user for a first and last name, and the name for a file. 
 * Randomly choose five grades for that person from 1 to 100 and store them in an array that can hold five integers. 
 * Then output the first and last name and those five grades to the specified file.
 * 
 * Use DataOutputStreams for writing in binary
 * Use FileWriter for writing in characters
 * Use PrintWriter for writing the characters in their form;
 * 
 */
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GradesInAnArrayAndAFile {
	
	public static void main (String[] args) throws IOException {
		
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		//BufferedWriter outputStream = null;
		PrintWriter outputStream = null;
		BufferedReader inputStream = null;
		String fileName;
		String name;
		int[] grades = new int[5];
		
		System.out.print("Name (first last): ");
		name = keyboard.nextLine();
		System.out.print("Filename: ");
		fileName = keyboard.next();
		
		try {
			//outputStream = new BufferedWriter(new FileWriter(fileName));
			outputStream = new PrintWriter(new FileWriter(fileName));
			outputStream.println(name);
			//outputStream.newLine();
			
			for (int i=0;i<grades.length;i++)
			{
				grades[i] = 1 + r.nextInt(100);
				outputStream.print(grades[i]);
				outputStream.print(" ");
			}
			
			System.out.println("Here are your randomly-selected grades (hope you pass):");
			for (int i=0;i<grades.length;i++)
			{
				System.out.format("Grade %d: %d%n",(i+1), grades[i]);	
			}			
			outputStream.close();
			
			inputStream = new BufferedReader(new FileReader(fileName));
			String c;
			while ((c = inputStream.readLine()) != null)
			{
				System.out.println(c);
			}
			inputStream.close();
		} finally {
			if (outputStream != null)
			{
				outputStream.close();
			}
			if (inputStream != null)
			{
				inputStream.close();
			}
		  }
	}
}

