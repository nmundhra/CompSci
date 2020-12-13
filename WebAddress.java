/*
 * WebAddress.java
 * 
 * Records are an easy way to create a single variable that can hold several different values. 
 * For example, consider the problem of storing a mailing address. The address has many parts, but is conceptually one unit. 
 * I have created a text file with some fake addresses. This file contains six addresses.
 * The code provided will create a record called "Address" that contains four fields:
a field for the house number / street name (a String)
a field for the city name (a String)
a field for the state (a String)
a field for the zip code (an int)
Then, the code provided creates a variable of type Address and reads the values from the first address in the text file into the four fields of the record.

It does the same thing for a second and third address. Finally, it prints out the three addresses on the screen.
 * 
 */
import java.net.URL;
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddresses
{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
		Scanner fin = new Scanner( addys.openStream() );

		Address uno = new Address();
		uno.street = fin.nextLine();
		uno.city   = fin.nextLine();
		uno.state  = fin.next();
		uno.zip    = fin.nextInt();
		fin.skip("\n");

		Address dos = new Address();
		dos.street = fin.nextLine();
		dos.city   = fin.nextLine();
		dos.state  = fin.next();
		dos.zip    = fin.nextInt();
		fin.skip("\n");

		Address tre = new Address();
		tre.street = fin.nextLine();
		tre.city   = fin.nextLine();
		tre.state  = fin.next();
		tre.zip    = fin.nextInt();
		fin.skip("\n");
		
		fin.close();
		
		System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
		System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
	}
}
