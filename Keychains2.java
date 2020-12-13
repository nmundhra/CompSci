/*
 * Keychains2.java
 * 
 * You will need 2 new variables in main, one to store the current number of keychains, and one to store the price per keychain.
The price should be $10 per keychain.
add_keychains() will need to be passed one int, and have a return type of int. It will ask the user for the number of keychains to add to the order, and then return the new number of keychains.
remove_keychains() will need to be passed one int, and have a return type of int. It will ask the user for the number of keychains to remove from the order, and then return the new number of keychains.
view_order() will need to be passed two ints, and have a return type of void. It will display, on three different lines, the number of keychains in the order, the price per keychain, and the total cost of the order.
checkout() will need to be passed two ints, and have a return type of void. It will ask the user for his/her name in order to deliver them correctly, display the order information, and then thank the user, by name, for ordering.
 * 
 */
import java.util.Scanner;

public class Keychains2 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int choice;
		int price = 10, num = 0;
		
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
				num = add_keychains(num);
				System.out.println("You have now " + num + " keychains.\n");
			}
			else if (choice == 2 )
			{
				num = remove_keychains(num);
				System.out.println("You have now " + num + " keychains.\n");
			}
			else if (choice == 3 )
			{
				view_order(num, price );
			}
			else if (choice == 4 )
			{
				checkout(num, price);
			}
			else
			{ 
				System.out.println("\nWrong choice, try again!\n");
			}	
		} while (choice != 4);
			 
	}
	
	public static int add_keychains(int n) {
		
		int num;
		
		System.out.print("You have " + n + " keychains. How many to add? ");
		num = keyboard.nextInt();
		
		return (num + n);
	}
	
	public static int remove_keychains(int n) {
		
		int num;
		
		System.out.print("You have " + n + " keychains. How many to remove? ");
		num = keyboard.nextInt();
		
		return (n - num);
	}
	
	public static void view_order(int n, int p) {
		
		System.out.println("\nYou have " + n + " keychains.");
		System.out.println("Keychains cost $" + p + " each.");
		System.out.println("Total cost is " + ( n * p ) + ".\n");
	}
	
	public static void checkout(int n, int p) {
		
		System.out.print("What is your name? ");
		String name = keyboard.next();
		
		System.out.println("\nYou have " + n + " keychains.");
		System.out.println("Keychains cost $" + p + " each.");
		System.out.println("Total cost is " + ( n * p ) + ".");
		System.out.println("Thanks for your order, " + name + "!");
		
	}
	
}

