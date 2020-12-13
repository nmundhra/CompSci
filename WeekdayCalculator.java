/*
 * WeekdayCalculator.java
 * Using the functions you wrote in previous assignments and the leap year function provided, write a function to determine the day of the week a person was born given his or her birthday. The following steps should be used to find the day of the week corresponding to any date from 1901 through the present.

In the following explanation, the following terms will be helpful. Assuming I type in my birthday as "6 10 1981":

The month is 6.
The day of the month is 10.
The year is 1981.

Find the number of years since 1900, and put it into a variable called yy. Simply subtract 1900 from the year to get this.
Divide the number of years since 1900 by 4. Put the quotient in a variable called total. For example, if the person was born in 1983, divide 83 by 4 and store 20 in  total.
Also add the number of years since 1900 to  total.
Add the day of the month to total.
Using the function month_offset() you wrote, find the "month offset" and add it to total.
If the year is a leap year and if the month you are working with is either January or February, then subtract 1 from the  total. You can use the function is_leap() provided to determine if the year is a leap year.
Find the remainder when total is divided by 7. Pass this remainder to the function weekday_name() you wrote to determine the day of the week the person was born.
Finally, build up a single String value containing the whole date (day of week, month, day, year). You'll need to use the function month_name() you wrote to show the month name rather than its number.
Return that String value.
* 
 */
import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on ");
		System.out.println(weekday(mm,dd,yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";

		// bunch of calculations go here
		yy = yyyy - 1900;
		
		total = ( yy / 4 ) + yy + dd;
		
		int offset = month_offset(mm);
		total = total + offset;
		
		boolean isLeap = is_leap(yyyy);
		String mon = month_name(mm);
		
		if ( isLeap && (mon.equals("January") || mon.equals("February")))
			total = total - 1;
			
		int x = total % 7;
		String wday = weekday_name(x);
		
		date = wday + ", " + mon + " " + dd + ", " + yyyy; 
		//date = month_name(mm) + ", " + yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
	public static String weekday_name(int n ) {

		if (n == 1 )
			return "Sunday";
		else if (n == 2 )
			return "Monday";
		else if (n == 3 )
			return "Tuesday";
		else if (n == 4 )
			return "Wednesday";
		else if (n == 5 )
			return "Thursday";
		else if (n == 6 )
			return "Friday";
		else if (n == 7 )
			return "Saturday";
		else 
			return "Error";		
		
	}
	
	public static String month_name(int n ) {
		
		if (n == 1 )
			return "January";
		else if (n == 2 )
			return "February";
		else if (n == 3 )
			return "March";
		else if (n == 4 )
			return "April";
		else if (n == 5 )
			return "May";
		else if (n == 6 )
			return "June";
		else if (n == 7 )
			return "July";
		else if (n == 8 )
			return "August";
		else if (n == 9 )
			return "September";
		else if (n == 10 )
			return "October";
		else if (n == 11 )
			return "November";
		else if (n == 12 )
			return "December";
		else
			return "Error";
	}

	public static int month_offset(int n ) {
		
		if (n == 1 || n == 10 )
			return 1;
		else if (n == 2 || n == 3 || n == 11)
			return 4;
		else if (n == 4 || n == 7)
			return 0;
		else if (n == 5 )
			return 2;
		else if (n == 6 )
			return 5;
		else if (n == 8 )
			return 3;
		else if (n == 9 || n == 12 )
			return 6;
		else
			return -1;
	}
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}
}
