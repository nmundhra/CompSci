/*
 * BMICalc.java
 */
import java.util.Scanner;

public class BMICalc {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double height, mass, bmi;
		//provide the height in meters and weight in Kg
		System.out.print("Your height in m: ");
		height = keyboard.nextDouble();
		
		System.out.print("Your weight in kg: ");
		mass = keyboard.nextInt();
		
		bmi = mass / ( height * height );
		
		System.out.println();
		System.out.print("Your BMI is " + bmi );
		
		//Imperial measurement code starts here
		//convert the pound to kg and inches to meters
		//1 pounds = .453 KG, 1 inch = .0254 meters
		
		double mass_in_pound, height_in_inches;
		System.out.println();
		System.out.print("Your height in inches: ");
		height_in_inches = keyboard.nextDouble();
		System.out.print("Your weight in pounds: ");
		mass_in_pound = keyboard.nextDouble();
		
		mass = mass_in_pound * 0.453;  //convert to Kg
		height = height_in_inches * 0.0254;  // Convert to meters
		
		bmi = mass / (height * height);
		
		System.out.println();
		System.out.print("Your BMI is " + bmi);
		
	}
}

