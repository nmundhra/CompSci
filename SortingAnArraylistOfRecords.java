/*
 * SortingAnArraylistOfRecords.java
 * 
 * Make a record to store information about a car. (This should seem familiar.) It should contain fields for:

the make (String)
the model (String)
the year (int)
the license-plate number (String)
* Create an ArrayList of Car objects.
 * Ask the user for the name of a file, and then open that file and read all that data from that file into the ArrayList.
 * Finally, sort the ArrayList of cars by year and print them out. 
 * (Note: Printing them the "easy" way won't work unless you've added a toString() method to the Car object.)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class Cars {
	String make;
	String model;
	int year;
	String plate;
	
	public String toString() 
	{
		return (this.make + " " + this.model + " " + this.year + " " + this.plate);
	}
}

public class SortingAnArraylistOfRecords {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner file = null;
		
		ArrayList<Cars> carList = new ArrayList<Cars>();
		String fileName;
		
		System.out.print("Which file to open: ");
		fileName = keyboard.next();
		
		try{
			file = new Scanner(new FileReader(fileName));
				
			while(file.hasNext())
			{			
				Cars cars = new Cars();
				cars.make = file.next();
				cars.model = file.next();
				cars.year = file.nextInt();
				cars.plate = file.next();
	
				carList.add(cars);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (file != null)
				file.close();
		}
		
		System.out.println("Data Loaded");
	
		System.out.println("ArrayList before: ");
		for(Cars cars : carList)
		{
			System.out.println(cars);
		}
		
		sort_cars_by_year(carList);
		System.out.println("Data Sorted");
		System.out.println();
		System.out.println("ArrayList after: ");
		for(Cars cars : carList)
		{
			System.out.println(cars);
		}
		
	}
	
	public static void sort_cars_by_year(ArrayList<Cars> carList) {
		
		for (int i=0;i<carList.size();i++)
		{	
			for (int j=i;j<carList.size();j++)
			{
				//carList.get(i) is an object of type Cars, so it can reference the year directly.
				if ((carList.get(i)).year > (carList.get(j)).year)
				{
					Cars temp = carList.get(i);
					carList.set(i, carList.get(j));
					carList.set(j , temp);
				}
			}
		}
	}
}

