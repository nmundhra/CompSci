/*
 * Keychains1.java
 * 
 * Write a program that pulls up a menu with 4 options.
 * You will need to create functions for each of the 4 menu options. Entering the number will call the correct function.
This assignment does not require you to complete ANY of the functionality except for the working menu system. There is no need for you to program the ability to add keychains, remove keychains, view orders or checkout.
The functions should be named add_keychains(), remove_keychains(), view_order() and checkout().
Each function should print a message that it has been called.
The user should be able to keep putting in choices until the checkout() function is called. When checkout() is finished, the program should end.
* 
 */
import java.util.Scanner;

public class Keychains1 {
	
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		System.out.println("Ye olde keychain shoppe\n");
		do 
		{
			System.out.println("1. Add keychains to order");
			System.out.println("2. Remove keychains from order");
			System.out.println("3. View current order");
			System.out.println("4. Checkout");
			
			System.out.print("\nPlease enter your choice: ");
			choice = keyboard.nextInt();
			
			if (choice == 1 )
			{
				add_keychains();
			}
			else if (choice == 2 )
			{
				remove_keychains();
			}
			else if (choice == 3 )
			{
				view_order();
			}
			else if (choice == 4 )
			{
				checkout();
			}
			else
			{ 
				System.out.println("\nWrong choice, try again!\n");
			}	
		} while (choice != 4);
			 
	}
	
	public static void add_keychains() {
		
		System.out.println("\nADD KEYCHAINS\n");
	}
	
	public static void remove_keychains() {
	
		System.out.println("\nREMOVE KEYCHAINS\n");
	}
	
	public static void view_order() {
		
		System.out.println("\nVIEW ORDER\n");
	}
	
	public static void checkout() {
		System.out.println("\nCHECKOUT\n");
	}
	
}

