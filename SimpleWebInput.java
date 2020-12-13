/*
 * SimpleWebInput.java
 * 
 * In Java, reading text from a web page isn't much more difficult than reading from a text file!
 * 
 */
import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput
{
	public static void main(String[] args) throws Exception
	{
		//URL mcool = new URL("https://cs.leanderisd.org/mitchellis.txt");
		URL mcool = new URL("https://docs.oracle.com/javase/tutorial/essential/io/objectstreams.html");
		
		Scanner webIn = new Scanner( mcool.openStream() );
		
		while (webIn.hasNext())
		{
			String one = webIn.nextLine();
			System.out.println(one);
		}
		webIn.close();
	}
}
