/*
 * Boxy2.java
 * 
 * In the paint() method of Boxy2, write code to draw eleven (11) colored boxes on the screen. 
 * Each box should be 100 pixels wide and 100 pixels high. 
 * Draw each box in a different color and draw them at different places on the screen. It is okay if some of the boxes overlap. 
 * The first box is done for you.
 * This time, rather than manually writing the code for each box, you should pass appropriate values to the drawBox() function already provided.
 */
import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color    x    y
		drawBox( window, Color.RED, 200, 300 );

		// draw ten more boxes -- different colors, different places
		drawBox( window, Color.GREEN, 300, 300 );
		drawBox( window, Color.BLUE, 400, 300);
		drawBox( window, Color.CYAN, 200, 50 );
		drawBox( window, Color.BLACK, 350, 50 );
		drawBox( window, Color.DARK_GRAY, 500, 50 );
		drawBox( window, Color.GRAY, 650, 50 );
		drawBox( window, Color.MAGENTA, 200, 175 );
		drawBox( window, Color.LIGHT_GRAY, 350, 175 );
		drawBox( window, Color.ORANGE, 500, 175 );
		drawBox( window, Color.PINK, 100, 100 );
		drawBox( window, Color.YELLOW, 100, 250 );
		
	}
	
	public void drawBox( Graphics window, Color c, int x, int y )
	{
		// already finished; do not modify
		
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
