/*
 * HighScore.java
 * 
 * Write a dumb little program that asks the user for their name and a number. 
 * Then store that name and that "high score" in a file. The file should be called "score.txt".
 * 
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {
	
	public static void main (String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		//PrintWriter outputStream = null;
		BufferedWriter outputStream = null;
		
		System.out.println("You got a high score!\n");
		System.out.print("Please enter your score: ");
		int score = keyboard.nextInt();
		System.out.print("Please enter your name: ");
		String name = keyboard.next();
		
		try {
			//outputStream = new PrintWriter(new FileWriter("Score.txt"));
			outputStream = new BufferedWriter(new FileWriter("Score.txt"));
			outputStream.write(name + " " + score);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}

