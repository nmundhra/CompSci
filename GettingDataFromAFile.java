/*
 * GettingDataFromAFile.java
 * 
 * Make a record to store information about a dog. It should contain fields for:
a breed, which is a String,
an age, which is an integer, and
a weight, which is a double
 * Using Notepad or the text editor of your choice, create a text file containing six pieces of information. 
 * Save this file in your home directory.
 * Create two Dog objects (not in an array).
 * Ask the user for the name of a file to open, and open that file and read in a breed, age, weight, and breed, age, weight 
 * from the file.
 * Display the values you read in
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class Dog 
{
	String breed;
	int age;
	double weight;
	
	public String toString()
	{
		return (this.breed + ", " + this.age + ", " + this.weight);
	}
}

public class GettingDataFromAFile {
	
	public static void main (String[] args) throws IOException {
		
		Scanner fil = null;
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		
		System.out.print("Which file to open: ");
		fileName = keyboard.next();
		
		try 
		{
			fil = new Scanner(new FileReader(fileName));
			
			Dog d1 = new Dog();
			d1.breed = fil.next();
			d1.age = fil.nextInt();
			d1.weight = fil.nextDouble();
			
			Dog d2 = new Dog();
			d2.breed = fil.next();
			d2.age = fil.nextInt();
			d2.weight = fil.nextDouble();
			
			System.out.println();
			System.out.println("Frist dog: " + d1);
			System.out.println("Second dog: " + d2);
		
		} finally {
			if (fil != null)
				fil.close();
		}
		
	}
}

