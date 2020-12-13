/*
 * SortingRecordsOnTwoFields.java
 * 
 * Make a record to store information about a student's grades. It should contain fields for:

the student, which is identified by a three-digit integer for their "student id number"
the grade number, which is an integer (1-6)
the grade, which is a floating-point value (0.0 through 100.0)
the corresponding letter grade, which should be a String
I have provided a file filled with grade information. You should create an array of records with 30 slots. Read the contents of the file into the array of records.

gb.txt - "https://programmingbydoing.com/a/examples/gb.txt"
 * Then, rearrange the array so that grades are sorted by grade number within student and display the sorted contents.
 * 
 */
//import java.net.URL;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

class Student {
	int student_id;
	int grade_num;
	double grade;
	String l_grade;
	
	public String toString() 
	{
		return (this.student_id + " " + this.grade_num + " " + this.grade + " " + this.l_grade);
	}
}
public class SortingRecordsOnTwoFields {
	
	public static void main (String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		Scanner file = null;
		//URL url = new URL("https://programmingbydoing.com/a/examples/gb.txt");
		Student[] st = new Student[30];
		System.out.print("Which file to open: ");
		String fileName = keyboard.next();
		
		try
		{
			//file = new Scanner( url.openStream() );
			file = new Scanner(new FileReader(fileName));
			read(st,file);
			sort_by_id(st);
			System.out.println("Students sorted by student id\n");
			display(st);
			sort_by_grade_num(st);
			System.out.println("Students sorted by student grade number\n");
			display(st);
			
		} finally {
			if (file != null)
				file.close();
		}
	}
	
	//this method is to read the file and build the array of Student
	public static void read(Student[] s, Scanner file) {
		
		for (int i=0;i<s.length;i++)
		{
			s[i] = new Student();
			s[i].student_id = file.nextInt();
			s[i].grade_num = file.nextInt();
			s[i].grade = file.nextDouble();
			s[i].l_grade = file.next();
		}
		return;
	}
	
	//this method will sort the file by student id
	public static void sort_by_id(Student[] s) {
		
		for (int i=0;i<s.length-1;i++)
		{
			for (int j=i;j<s.length;j++)
			{
				if (s[i].student_id > s[j].student_id)
					swap(s,i,j);
			}
		}
		return;
	}
	
	//this method will sor the file with a subkey of grade number.
	//the file is already sorted by student id
	public static void sort_by_grade_num(Student[] s) {
		
		//minIndex & maxIndex will track the position of next student id to create a subarray
		int maxIndex = 0, minIndex = 0;
		for (int i=0;i<s.length-1;i++)
		{
			if (s[i].student_id != s[i+1].student_id)
			{
				minIndex = maxIndex;
				maxIndex = i+1;
				sort_by_grade_number(s, minIndex, maxIndex);
			}
		}
		minIndex = maxIndex;
		sort_by_grade_number(s,minIndex,s.length);
		return;
	}
	
	public static void sort_by_grade_number(Student[] s, int minIndex, int maxIndex) {
		
		for (int i=minIndex;i<maxIndex;i++)
		{
			for (int j=i;j<maxIndex;j++)
			{
				if (s[i].grade_num > s[j].grade_num)
				{
					swap(s,i,j);
				}
			}
		}
		return;
	}
	
	//this method is to swap the records of type Student
	public static void swap(Student[] s, int i, int j) {
		
		Student temp = new Student();
		temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		
		return;
	}
	
	//this method is to read the Student array and display on the screen
	public static void display(Student[] s) {
		
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		return;
	}
	
}

