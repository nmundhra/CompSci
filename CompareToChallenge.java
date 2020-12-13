/*
 * CompareToChallenge.java
 * 
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * Write a program that compares several Strings using the compareTo() method. 
 * You should display the Strings and display the integer that compareTo() gives you.
 * You must have five examples which result in a number less than 0, five examples which 
 * result in a number greater than 0, and two examples which give you exactly 0. This means you need a total of twelve examples.
 * You may not just flip the Strings around; you must have twelve different examples.
 * 
 */

public class CompareToChallenge {
	
	public static void main (String[] args) {
		int i;
		
		System.out.println("Comparing \"axe\" with \"dog\""); 
		i = "axe".compareTo("dog");
		System.out.println(i);
		System.out.println("Comparing \"axe\" with \"axe\"");
		i= "axe".compareTo("axe");
		System.out.println(i);
		System.out.println("Comparing \"axe\" with \"axa\"");
		i= "axe".compareTo("axa");
		System.out.println(i);
		System.out.println("Comparing \"laptop\" with \"lapcop\"");
		i= "laptop".compareTo("lapcop");
		System.out.println(i);
		System.out.println("Comparing \"weak\" with \"week\"");
		i= "weak".compareTo("week");
		System.out.println(i);
		System.out.println("Comparing \"dear\" with \"deer\"");
		i= "dear".compareTo("deer");
		System.out.println(i);
		System.out.println("Comparing \"mug\" with \"jug\"");
		i= "mug".compareTo("jug");
		System.out.println(i);
		System.out.println("Comparing \"tiger\" with \"lion\"");
		i= "tiger".compareTo("lion");
		System.out.println(i);
		System.out.println("Comparing \"phone\" with \"fone\"");
		i= "phone".compareTo("fone");
		System.out.println(i);
	}
}

