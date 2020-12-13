/*
 * WhatIf.java
 * 
 */


public class WhatIf {
	
	public static void main (String[] args) {
		int people = 20;
		int dogs = 15;
		//make cats equals peoples, so neither condtion for cats will execute. Original value was 30.
		int cats = 20;

//if the condition in IF evaluates to true, the code between the braces executes.
		if (people < cats )
		//curly braces makes a block of statements which gets run when the conditon
		// in IF is true.
		{
			System.out.println("Too many cats! The world is doomed!");
		}
		if ( people > cats )
		{
			System.out.println("Not many cats! The world is saved!");
		}
		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}
		dogs += 5;
		
		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		} 
	}
}

