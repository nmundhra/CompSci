/*
 * AddressToString.java
 * 
 * If you want, you can add a toString() method to a record. 
 * The function should return a String showing how the record should be printed. 
 * Using a toString() method makes printing records much easier.
 */
import java.net.URL;
import java.util.Scanner;

class Address {
	String street;
	String city;
	String state;
	int zip;
	
	public String toString() 
	{
		return (this.street + ", " + this.city + ", " + this.state + ", " + this.zip);
	}
}

public class AddressToString {
	
	public static void main (String[] args) throws Exception {
		
		URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
		Scanner fin = new Scanner( addys.openStream() );
		
		Address[] addr = new Address[6];
		
		for (int i=0;i<addr.length;i++)
		{
			addr[i] = new Address();
			addr[i].street = fin.nextLine();
			addr[i].city   = fin.nextLine();
			addr[i].state  = fin.next();
			addr[i].zip    = fin.nextInt();
			fin.skip("\n");
			System.out.println( (i+1) + ". " + addr[i] );
		}
		
		fin.close();
	}
}

