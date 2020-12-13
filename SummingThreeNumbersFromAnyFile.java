/*
 * SummingThreeNumbersFromAnyFile.java
 * 
 * Create several more files in Notepad containing three integers separated by some whitespace. 
 * Save them in your home directory as "3nums1.txt", "3nums2.txt", "3nums3.txt", etc.
 * Then write a program that asks the user which file to open.  * Then it should open that file, and read the three 
 * integers from the file. 
 * It should then display (on the screen) the total of the integers.
 * 
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SummingThreeNumbersFromAnyFile {
	
	public static void main (String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		Scanner inputStream = null;
		String fileName = "";
		
		System.out.format("Which file would you like to read numbers from: ");
		fileName = keyboard.next();
		
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

