/*
 * Boxy1.java
 * 
 * In the paint() method of Boxy1, write code to draw four (4) colored boxes on the screen. 
 * Each box should be 100 pixels wide and 100 pixels high. 
 * Draw each box in a different color and draw them at different places on the screen. It is okay if some of the boxes overlap.
 * Java has the following colors built in: BLACK, BLUE, CYAN, DARK_GRAY, GRAY, GREEN, LIGHT_GRAY, MAGENTA, ORANGE, PINK, RED, WHITE, YELLOW
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  1 - make them manually                               **
 ***********************************************************************************/

public class Boxy1 extends Canvas
{
	public void paint( Graphics window )
	{
		// this code draws a 100x100 box in blue at (200,300)
		window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);
		
		// draw three more boxes -- different colors, different places
		window.setColor(Color.RED);
		window.fillRect(100,100,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(110,110,80,80);
		
		window.setColor(Color.YELLOW);
		window.fillRect(400,100,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(410,110,80,80);
		
		window.setColor(Color.CYAN);
		window.fillRect(600,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(610,310,80,80);
		
	}

	public static void main( String[] args )
	{
		Canvas canvas = new Boxy1();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
