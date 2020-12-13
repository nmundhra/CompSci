/*
 * NumberPuzzle2.java
 * 
 * Use nested for loops to generate a list of all the two digit numbers which are less than or equal to fifty-six, 
 * and the sum of whose digits is greater than ten.
 * Use another set of nested for loops to find a two-digit number such that the number itself minus the number reversed 
 * is equal to the sum of its digits.
 * For example, 72 is not such a number because 72-27 (which is 45) is not the same as the sum of its digits (2+7 = 9).
 * Finally, put the code for each of the two parts into its own separate function, and have a menu in main() which allows 
 * you to choose which of the two sets to find.	This main program should keep repeating until you choose to quit (use a do-while loop for this).
 * 
 */
import java.util.Scanner;

public class NumberPuzzle2 {
	
	public static void main (String[] args) {
		Scanner keyword = new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("\n1) Find two digit numbers <=56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit");
			System.out.println();
			System.out.print("> ");
			
			choice = keyword.nextInt();
			
			if (choice == 1)
				fun1();
			else if (choice == 2)
				fun2();
			else if (choice == 3)
				System.out.println("Thank you!");
			else
				System.out.println("Wrong Choice! Try again");
				
		} while (choice != 3);
	}
	
	public static void fun1() {
		
		for (int i=1; i<=5;i++)
		{
			for (int j=0;j<=6; j++)
			{
				if ((i + j) > 10)
					System.out.print("(" + i + "," + j + ") ");
			}
		}
	}
	
	public static void fun2() {
		
		int n1 = 0, r1 = 0;
		String num = "", rnum = "";
		
		for (int i=1; i<=9;i++)
		{
			for (int j=0;j<=9; j++)
			{
				num = num + i + j;
				n1 = Integer.parseInt(num);
				
				rnum = rnum + j + i;
				r1 = Integer.valueOf(rnum);
				
				if ((n1 - r1) == (i + j))
					System.out.print(num + ", " + rnum + ", (" + i + "," + j + ") ");
				
				num = "";
				rnum = "";
				
			}
		}
		
	}
	
}

