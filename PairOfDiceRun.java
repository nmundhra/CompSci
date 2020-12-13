/*
 * PairOfDiceRun.java
 * 
 * 
 */


public class PairOfDiceRun {
	
	public static void main (String[] args) {
		
		PairOfDice pd = new PairOfDice(6,6);
		int count = 0;
		int val1, val2;
		do
		{
			pd.roll();
			val1 = pd.getDie1();
			val2 = pd.getDie2();
			count++;
		} while ((val1 + val2) != 2);
		
		System.out.println("value on dice is : " + pd);
		System.out.println("Dice are rolled " + count + " times.");
	}
}

