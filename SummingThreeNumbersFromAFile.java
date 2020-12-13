/*
 * SummingThreeNumbersFromAFile.java
 * 
 * First, create a file in Notepad containing three integers separated by some whitespace. 
 * Save it as "3nums.txt" in the same folder as your code.
 * Then write a program that reads three integers from the file 3nums.txt and displays (on the screen) the total of the integers.
 * 
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SummingThreeNumbersFromAFile {
	
	public static void main (String[] args) throws IOException {
		
		Scanner inputStream = null;
		String fileName = "3nums.txt";
		
		try {
			 inputStream = new Scanner(new BufferedReader (new FileReader(fileName)));
			 int num, times = 1; 
			 int sum = 0;
			 String s = "";
	
			 while (inputStream.hasNext())
			 {
				 num = inputStream.nextInt();
				 
				 if (times == 1)
					s = s + num; 
				 else
					s = s + " + " + num;
					
				 times++;
				 //System.out.format("%d%n",num);
				 sum = sum + num;
				 //other way to read in string and parse the int to take the sum.
				 //s = inputStream.next();
				 //System.out.format("%s%n",s);
				 //sum = sum + Integer.parseInt(s);
			 }
			 System.out.format("Reading number from file %s... done.%n%n",fileName);
			 System.out.format("%s = %d",s,sum);
			 //System.out.format("sum of number's is : %d", sum);
		} finally {
			if (inputStream != null)
			{
				inputStream.close();
			}
		}
	}
}

