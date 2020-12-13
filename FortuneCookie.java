/*
 * FortuneCookie.java
 * 
 * Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.
 * For bonus points, also add randomly-chosen lotto numbers to the fortune. In Texas, the lotto chooses 6 numbers, each from 1-54.
 */
import java.util.Random;

public class FortuneCookie {
	
	public static void main (String[] args) {
		Random r = new Random();
		String msg;
		
		int i = 1 + r.nextInt(6);
		String lotto = " ";
		int number;
		for (int j = 1;j <= 6; j++)
		{
			number = 1 + r.nextInt(54);
			if (j < 6 )
				lotto = lotto + number + " - ";
			else
				lotto = lotto + number;
		}
		
		if (i == 1 )
			msg = "You will find happiness with a new love.";
		else if (i == 2 )
			msg = "You will have a great day today.";
		else if (i == 3 )
			msg = "Be cautious today";
		else if (i == 4 )
			msg = "Not a good day for you";
		else if (i == 5 )
			msg = "You are due appreciation";
		else if (i == 6)
			msg = "Be alert on driving";
		else 
			msg = "Take rest.";
			
			
		System.out.println("Fortune cookie says: " + msg );
		System.out.println(lotto);
	}
}

