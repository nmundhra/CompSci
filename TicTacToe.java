/*
 * TicTacToe.java
 * 
 * Code an interactive, two-player game of Tic-Tac-Toe. You'll use a two-dimensional array of chars.
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class TicTacToe
{

	private static char[][] board = new char[3][3];
	private static int count = 0;
	private static int chance = 0;

	public static void main( String[] args )
	{
		Random r = new Random();
		
		initBoard();
		displayBoard();
		
		char p1 = 'X', p2 = 'O', p;
		boolean isWinnerFound = false;
		
		chance = 1 + r.nextInt(2);
		
		System.out.println("\nLet the Tic-Tac-Toe begin!\n");
			
		do
		{
			if (chance == 1)
			{
				p = p1;
				chance = 2;
			}
			else
			{
				p = p2;
				chance = 1;
			}
			isWinnerFound = play(p);
			
		} while (!(isWinnerFound) && count <=9);
		
		if (isWinnerFound)
			System.out.format("%n%s is the winner!%n",p);
		else
			System.out.println("The game is a tie!");
			
	}
	
	public static boolean play(char p) {
		
			Scanner keyboard = new Scanner(System.in);
			boolean isWin = false;
			
			System.out.format("%n'%s', Choose your location (row, column): ", p);
			int row = keyboard.nextInt();
			int col = keyboard.nextInt();
			
			if (board[row][col] == ' ')
			{
				board[row][col] = p;
				System.out.println("\n");
				displayBoard();
				count++;
				if (count >= 5)
				{
					isWin = winner(p,row,col);
				}
			}
			else
			{
				System.out.println("That place is filled, try again!\n");
				if (p == 'X')
					chance = 1;
				else
					chance = 2;
			}
			
			return isWin;
	}
	
	public static boolean winner(char p, int row, int col) {
		
		
		System.out.println("--------debug area------------");
		
		if (row == 0 && col == 0)
		{
			if (board[0][1] == p && board[0][2] == p)
				return true;
			else if (board[1][0] == p && board[2][0] == p)
				return true;
			else if (board[1][1] == p && board[2][2] == p)
				return true;
			else
				return false;
		}
		
		if (row == 1 && col == 1)
		{
			if (board[0][1] == p && board[2][1] == p)
				return true;
			else if (board[1][0] == p && board[1][2] == p)
				return true;
			else if (board[0][0] == p && board[2][2] == p)
				return true;
			else
				return false;
		}
		
		if (row == 2 && col == 2)
		{
			if (board[1][2] == p && board[0][2] == p)
				return true;
			else if (board[2][1] == p && board[2][0] == p)
				return true;
			else if (board[1][1] == p && board[0][0] == p)
				return true;
			else
				return false;
		}
		
		if (row == 0 && col == 1)
		{
			if (board[0][0] == p && board[0][2] == p)
				return true;
			else if (board[1][1] == p && board[2][1] == p)
				return true;
			else
				return false;
		}
		
		if (row == 0 && col == 2)
		{
			if (board[0][0] == p && board[0][1] == p)
				return true;
			else if (board[1][2] == p && board[2][2] == p)
				return true;
			else
				return false;
		}
		
		if (row == 1 && col == 0)
		{
			if (board[0][0] == p && board[2][0] == p)
				return true;
			else if (board[1][1] == p && board[1][2] == p)
				return true;
			else
				return false;
		}
		
		if (row == 1 && col == 2)
		{
			if (board[0][2] == p && board[2][2] == p)
				return true;
			else if (board[1][1] == p && board[1][0] == p)
				return true;
			else
				return false;
		}
		
		if (row == 2 && col == 0)
		{
			if (board[0][0] == p && board[1][0] == p)
				return true;
			else if (board[2][2] == p && board[2][1] == p)
				return true;
			else
				return false;
		}
		
		if (row == 2 && col == 1)
		{
			if (board[0][0] == p && board[0][2] == p)
				return true;
			else if (board[2][0] == p && board[2][2] == p)
				return true;
			else
				return false;
		}
		return false;
	}
	
	

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
}
