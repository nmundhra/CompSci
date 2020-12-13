/*
 * CountingFor.java
 * 
 * Copyright 2018 nmundhra <nmundhra@LNAR-PC06MEK7>
 * 
 * 
 */
import java.util.Scanner;

public class CountingFor {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type a message and I will display it 5 times");
		System.out.print("Message: ");
		String message = keyboard.nextLine();
		
		for (int i = 2; i <= 10; i = i + 2)
		{
			System.out.println(i + ". " + message);
		}
	}
}

