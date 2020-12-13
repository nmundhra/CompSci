/*
 * Keychains3.java
 * 
 * You're going to add some error checking and additional features, to Keychains2.
 * You need to make sure that the user always has a positive number, or 0, of keychains in the order.
 * You need to check for a valid menu choice. If not, display an error message and show the menu again.
 * You will need 3 new variables in main, one to store the sales tax (8.25%), one to store the shipping cost per order ($5.00), 
 * and one to store the additional per keychain shipping cost ($1.00).
 * view_order() will need to be passed the three additional variables, a total of five, and have a return type of void. 
 * It will display, on different lines, the number of keychains in the order, the price per keychain, the shipping charges on the order, the subtotal before tax, the tax on the order, and the final cost of the order.
 * view_order() might look like public static void view_order( int num_keychains, double price_per_keychain, double tax, int base_shipping, int per_keychain_shipping )
 * checkout() will need to be passed the same values as view_order(), and have a return type of void. 
 * It will ask the user for his/her name in order to deliver them correctly, then call view_order() to display the order information, and then thank the user, by name, for ordering.
 * 
 */
import java.util.Scanner;

public class Keychains3 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int choice;
		int price = 10, num = 0;
		double sales_tax = 8.25;
		int scost = 5, addcost = 1;
		
		System.out.println("Ye olde keychain shoppe\n");
		do 
		{
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
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
				view_order(num, price,sales_tax,scost, addcost);
			}
			else if (choice == 4 )
			{
				checkout(num, price, sales_tax, scost, addcost);
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
		
		if ( num < 0 )
		{
			System.out.println("\nEnter 1 or more keychains\n");
			return n;
		}
		else 
		{
			return (num + n);
		}
	}
	
	public static int remove_keychains(int n) {
		
		int num;
		
		System.out.print("You have " + n + " keychains. How many to remove? ");
		num = keyboard.nextInt();
		
		if (num > n )
		{
			System.out.println("\nYou can only remove " + n + " keychains.");
			return n;
		}
		else
		{
			return (n - num);
		}
	}
	
	public static void view_order(int n, int p, double tax, int base_shipping, int per_keychain_shipping) {
		
		double total_before_tax = ( n * p );
		double total_sales_tax = total_before_tax * (tax / 100);
		int total_shipping;
		
		if ( n > 5)
			total_shipping = (base_shipping + ((n - 5) * per_keychain_shipping));
		else
			total_shipping = base_shipping;
		
		System.out.println("\nYou have " + n + " keychains.");
		System.out.println("Keychains cost $" + p + " each.");
		System.out.println("The shipping charges $" + total_shipping + ".");
		System.out.println("Total cost before sales tax is " + total_before_tax + ".");
		System.out.println("Sales tax @" + tax + " on $" + total_before_tax + " is $" + total_sales_tax + ".");
		System.out.println("The total cost of order: $" + (total_before_tax + total_sales_tax + total_shipping) + ".\n");
		return;
	}
	
	public static void checkout(int n, int p, double tax, int base_shipping, int per_keychain_shipping) {
		
		System.out.print("What is your name? ");
		String name = keyboard.next();
		
		view_order(n,p,tax,base_shipping,per_keychain_shipping);
		
		System.out.println("Thanks for your order, " + name + "!");
		
		return;
	}
	
}

