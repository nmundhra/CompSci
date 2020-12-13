/*
 * TryCatch01.java
 * 
 */

public class TryCatch01 {
	
	public static void main (String[] args) {
		double x;
		String str = "fred";
		try {
		x = Double.parseDouble(str);
		System.out.println( "The number is " + x );
		}
		catch ( NumberFormatException e ) {
			System.out.println( "Not a legal number." );
			System.out.println(e.getMessage());
			x = Double.NaN;
		}
		System.out.println("The parsed String was: " + str);
		
	}
}

