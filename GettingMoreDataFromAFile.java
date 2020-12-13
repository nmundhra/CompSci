/*
 * GettingMoreDataFromAFile.java
 * 
 * Using Notepad or the text editor of your choice, create a text file containing five names and five ages. 
 * Save this file in your home directory.
 * Make a record to store information about a person. It should contain fields for:
a single name, which is a String, and
an age, which is an integer
 * Create an array of type Person with five slots.
 * Ask the user for the name of a file to open, and open that file and read in five names and ages from the file. 
 * Display the contents of the array using a loop.
 * 
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class Person {
	String name;
	int age;
	
	public String toString()
	{
		return (this.name + " is " + this.age);
	}
}

public class GettingMoreDataFromAFile {
	
	public static void main (String[] args) throws IOException{
		
		Scanner fil = null;
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		Person[] per = new Person[5];
		
		System.out.print("Which file to open: ");
		fileName = keyboard.next();
		
		System.out.println("Reading data from " + fileName);
		
		try
		{
			fil = new Scanner(new FileReader(fileName));
			
			for(int i=0;i<per.length;i++)
			{
				per[i] = new Person();
				per[i].name = fil.next();
				per[i].age = fil.nextInt();
			}
		} finally {
			if (fil != null)
				fil.close();
		}
		
		for (int i=0;i<per.length;i++)
		{
			System.out.println(per[i]);
		}
	}
}

