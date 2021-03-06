/*
 * SortingAnArrayOfRecords.java
 * 
 * Again, make a record to store information about a car. It should contain fields for:
the make, which is a String
the model, which is a String
the year, which is an integer
the license-plate number, which is a String
 * Create an array of type Car with five slots. (So far, this is the same as the previous assignment.)
 * Ask the user for the name of a file, and then open that file and read all the data from that file into the array.
 * 
 * However, once you've read in the car data from the file, then sort the array of cars by year. Then, print it out (now sorted)
 * 
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
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

public class SortingAnArrayOfRecords {
	
	public static void main (String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		Scanner file = null;
		
		Car[] car = new Car[5];
		
		try 
		{
			System.out.print("To which file do you want to load this information: ");
			String fileName = keyboard.next();
				
			file = new Scanner(new BufferedReader(new FileReader(fileName)));
			read(car, file);
			sort(car);
			
			System.out.println("Data loaded!");
			System.out.println();
			
			for (int i=0;i<car.length;i++)
			{
				System.out.println("Car " + (i+1));
				System.out.println("	Make: " + car[i].make);
				System.out.println("	Model: " + car[i].model);
				System.out.println("	Year: " + car[i].year);
				System.out.println("	License: " + car[i].plate);
				System.out.println();
			}
			
		} finally {
			if (file != null)
				file.close();
		}
				
	}
	
	public static void read(Car[] car, Scanner file) 
	{
		for (int i=0;i<car.length;i++)
		{
			car[i] = new Car();
			car[i].make = file.next();
			car[i].model = file.next();
			car[i].year = file.nextInt();
			car[i].plate = file.next();
		}
		return;
	}
	
	public static void sort(Car[] car) {
		
		for (int i=0;i<car.length-1;i++)
		{
			for (int j=i;j<car.length;j++)
			{
				if (car[i].year > car[j].year)
					swap(car,i,j);
			}
		}
		
	}
	
	public static void swap(Car[] car, int i, int j) {
		
		Car temp = new Car();
		temp = car[i];
		car[i] = car[j];
		car[j] = temp;
	}

}
