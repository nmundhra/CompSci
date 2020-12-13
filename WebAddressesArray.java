/*
 * WebAddressesArray.java
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

public class WebAddressesArray
{
	public static void main(String[] args) throws Exception
	{
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
			System.out.println(addr[i].street + ", " + addr[i].city + ", " + addr[i].state + "  " + addr[i].zip);
		}
		fin.close();
		
	}
}
