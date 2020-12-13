/*
 * AlphabaticalOrder.java
 * 
 * Make a program that asks for the last name of the user. Depending on their last name, 
 * make a statement about how long they have to wait during roll call. 
 * You need to use else ifs to make sure only one statement gets printed.
 * Once you understand how compareTo() works, this is a pretty straightforward assignment, much like How Old Are You, 
 * specifically, except that it uses Strings instead of ints and so you must use the compareTo() method.
 * 
 * 	name is "Carswell" or before: say "you don't have to wait long"
 * 	name is "Jones" or before: say "that's not bad"
 * 	name is "Smith" or before: say "looks like a bit of a wait.
 * 	name is "Young" or before: say "it's gonna be a while"
 * 	name is after "Young": say "not going anywhere for a while?"
 * 
 */
import java.util.Scanner;

public class AlphabaticalOrder {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String lname;
		int i,j,k,l,m;
		
		i=j=k=l=m = 0;
		
		System.out.print("What is your last name: ");
		lname = keyboard.next();
		
		if ((i = lname.compareTo("carswell")) <= 0 )
			System.out.println("You don't have to wait long, " + lname );
		else if ((j = lname.compareTo("Jones")) <= 0 )
			System.out.println("That's not bad, " + lname);
		else if ((k = lname.compareTo("Smith")) <= 0 )
			System.out.println(lname + " ,it looks like a bit of a wait.");
		else if ((l = lname.compareTo("Young")) <= 0 )
			System.out.println(lname + " ,it's gonna be a while.");
		else
			System.out.println(lname + " ,not going anywhere for a while?");
			
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("l = " + l);
	}
}

