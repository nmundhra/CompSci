/*
 * LetterRevisited.java
 * 
 * 
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class LetterRevisited {
    public static void main(String[] args) throws IOException {

        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileWriter("letter.txt"));

			outputStream.println("+-------------------------------+");
			outputStream.println("|                         ####  |");
			outputStream.println("|                         ####  |");
			outputStream.println("|                         ####  |");
			outputStream.println("|                               |");
			outputStream.println("|            ABC & Co.          |");
			outputStream.println("|            1 Chicago Ave.     |");
			outputStream.println("|            Chicago, IL 60604  |");
			outputStream.println("|                               |");
			outputStream.println("+-------------------------------+");
            
        } finally {
			if (outputStream != null) {
				outputStream.close();
			}
        }
    }
}
