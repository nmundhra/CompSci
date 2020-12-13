/*
 * Adventure2.java
 * 
 * Make another short "Choose Your Own Adventure" game. 
 * However, this time you need to use a loop so that they can freely move from room to room and back again.
 * There need to be at least six rooms or destinations, and at least two different ways for the game to end.
 */
import java.util.Scanner;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";
		
		System.out.println("MITCHELL'S TINY ADVENTURE 2!");

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are in a creepy house! would you like to go to \"upstairs\" or into the \"kitchen\"?" );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("upstairs") )
					nextroom = 2;
				else if ( choice.equals("kitchen") )
					nextroom = 3;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "Upstairs you see a hallway. At the end of the hallway is the master " );
				System.out.println("\"bedroom\". There is also a \"bathroom\" off the hallway. Or you can ");
				System.out.println("go back \"downstairs\". Where would you like to go?");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("bedroom") )
					nextroom = 5;
				else if ( choice.equals("bathroom") )
					nextroom = 6;
				else if ( choice.equals("downstairs") )
					nextroom = 1;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 3 )
			{
				System.out.println( "There is a long countertop with dirty dishes everywhere. Off to one side " );
				System.out.println("there is, as you'd expect, a \"refrigerator\". you may open the \"refrigator\"");
				System.out.println("or go \"back\".");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("refrigerator") )
					nextroom = 4;
				else if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( "ERROR." );
			}
			if ( nextroom == 4 )
			{
				System.out.println("Inside the refriderator you see food and stuff. It looks pretty nasty. " );
				System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("yes") )
				{
					System.out.println("The food is slimmy and foul, but you manage to choke it down.");
					System.out.println("You feel faint. Sliding to the floor, the darkness closes in.\n\n");
					System.out.println("You have died");
					nextroom = 0;
				}
				else if ( choice.equals("no") )
					nextroom = 3;
				else
					System.out.println( "ERROR." );
			}
		}

		System.out.println( "\nEND." );
	}
	
}
