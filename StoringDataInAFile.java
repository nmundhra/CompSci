/*
 * StoringDataInAFile.java
 * 
 * Make a record to store information about a car. It should contain fields for:
the make, which is a string
the model, which is a string
the year, which is an integer
the license-plate number, which is a string
 * Create an array of type Car with five slots. Have the user type in values to fill up the array.
 * Ask the user for the name of a file, and then open that file and output all the data from the array to that file.
 * Use Notepad or some other text editor to confirm that the data is correctly in the file. Be careful to only put data in the file, and not labels.
 * 
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class Car {
	String make;
	String model;
	int year;
	String plate;
	
	public String toString()
	{
		return(this.make + " " + this.model + " " + this.year + " " + this.plate);
	}
}

public class StoringDataInAFile {
	
	public static void main (String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		PrintWriter file = null;
		
		Car[] car = new Car[5];
		
		try 
		{
			
			for (int i=0;i<car.length;i++)
			{
				car[i] = new Car();
				System.out.println("Car " + (i+1));
				System.out.print("	Make: ");
				car[i].make = keyboard.next();
				System.out.print("	Model: ");
				car[i].model = keyboard.next();
				System.out.print("	Year: ");
				car[i].year = keyboard.nextInt();
				System.out.print("	License: ");
				car[i].plate = keyboard.next();
				System.out.println();
			}
			System.out.print("To which file do you want to save this information: ");
			String fileName = keyboard.next();
				
			file = new PrintWriter(new FileWriter(fileName));
			write(car, file);
			System.out.println("Data Saved!");
			
		} finally {
			if (file != null)
				file.close();
		}
				
	}
	
	public static void write(Car[] car, PrintWriter file) 
	{
		for (int i=0;i<car.length;i++)
		{
			file.print(car[i]);
			file.println();
		}
		return;
	}

}

