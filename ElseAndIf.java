/*
 * ElseAndIf.java
 * 
 */
//if the condition in the IF evaluates to false it jumps to the next ELSE IF statement
//if that too evaluate to false than the control goes to the last ELSE without any condition 
//and execute that block of code between curly braces.

//if we remove the ELSE part of one of the Else if statement, the IF above that else will execute 
//as a separate condition and the new IF / Else forms a new condition block.

public class ElseAndIf {
	
	public static void main (String[] args) {
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
	}
}

