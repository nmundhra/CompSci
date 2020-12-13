/*
 * SortingAnArrayListOfStrings.java
 * 
 * Write a program that creates an ArrayList of Strings. Make up ten or more random words (all lowercase) and put them in the ArrayList in any way you choose. 
 * Display them on the screen.  Then, using the sort of your choice, arrange the words in alphabetical order and display them again.
 * Just like last time, you must put the sorting code in its own function.
 * 
 */
import java.util.ArrayList;
import java.util.Random;

public class SortingAnArrayListOfStrings {
	
	public static void main (String[] args) {
		Random r = new Random();
		String[] words = {"ask","can","boy","toy","lion","big","small","java","apple","math",
						"swing","play","joy","laugh","happy","sad","for","not","do","hello",
						"let","call","ride","bike","see","tear","dog","cat","fish","whale"};
						
		ArrayList<String> list = new ArrayList<String>();
		
		//select any 10 words out of 30 from the words array, and add to ArrayList;
		for(int i=0;i<10;i++)
		{
			int wordIndex = (int)( Math.random() * 30 );
			list.add(words[wordIndex]);
		}
			
		System.out.println("ArrayList before: " + list);
		sortArrayList(list);
		System.out.println("ArrayList after: " + list);
	}
	
	public static void sortArrayList(ArrayList<String> list) {
		
		for (int i=0;i<list.size();i++)
		{
			for (int j=i;j<list.size();j++)
			{
				if (list.get(i).compareTo(list.get(j)) > 0)
				{
					String temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
	}
}



