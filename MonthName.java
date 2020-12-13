/*
 * MonthName.java
 * 
 * Write a function. It will return the name of a month of the year, given the month number, according to the table below. 
 * Make sure you do not put any input or output statements in the function; 
 * the month number will be passed in and the string containing the name will be returned.
 * The function must be called month_name(), and must have one parameter (an integer), and return a String.
 * 
 */


public class MonthName {
	
	public static void main (String[] args) {
		
		System.out.println("Month 01: " + month_name(1) );
		System.out.println("Month 02: " + month_name(2));
		System.out.println("Month 03: " + month_name(3));
		System.out.println("Month 04: " + month_name(4));
		System.out.println("Month 05: " + month_name(5));
		System.out.println("Month 06: " + month_name(6));
		System.out.println("Month 07: " + month_name(7));
		System.out.println("Month 08: " + month_name(8));
		System.out.println("Month 09: " + month_name(9));
		System.out.println("Month 10: " + month_name(10));
		System.out.println("Month 11: " + month_name(11));
		System.out.println("Month 12: " + month_name(12));
		System.out.println("Month 35: " + month_name(35));
		
		
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
}

