/*
 * ModulusAnimation.java
 * 
 */


public class ModulusAnimation {
	
	public static void main (String[] args) throws Exception {
		
		int repeat = 5;
		for ( int i=0; i<10 * repeat; i++ )
		{
			if ( i%10 == 0 )
				System.out.print("Mr. Mitchell is cool.  \r");
			else if ( i%10 == 1)
				System.out.print("	Mr. Mitchell is cool.\r");
			else if ( i%10 == 2 )
				System.out.print("		Mr. Mitchell is c\r");
			else if ( i%10 == 3 )
				System.out.print("			Mr. Mitchell \r");
			else if ( i%10 == 4 )
				System.out.print("				Mr. Mitch\r");
			else if ( i%10 == 5 )
				System.out.print("						M\r");
			else if ( i%10 == 6 )
				System.out.print("	Mr. Mitchell is cool.\r");
			else if ( i%10 == 7 )
				System.out.print("		Mr. Mitchell is c\r");
			else if ( i%10 == 8 )
				System.out.print("			Mr. Mitchell \r");
			else if ( i%10 == 9 )
				System.out.print("				Mr. Mitch\r");
				
			Thread.sleep(500);
		}
	}
}

