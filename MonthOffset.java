/*
 * MonthOffset.java
 * 
 * Write a function to give you the "month offset" given a number representing the month. 
 * 
 */


public class MonthOffset {
	
	public static void main (String[] args) {
		
		System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println( "Offset for month 43: " + month_offset(43) );
		
		
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
}

