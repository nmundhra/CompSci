/*
 * Boxy3.java
 * 
 * In the paint() method of Boxy3, write code to draw eight (8) colored boxes on the screen. 
 * Draw each box in a different color and draw them at different places on the screen. Also, make them different sizes. 
 * It is okay if some of the boxes overlap. Draw them by passing appropriate values to the drawBox() function. 
 * The first two boxes are done for you.
 * Also, the drawBox() function is empty! You should put the code in there to make it draw a box with the given parameters.
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  400, 220, 30, 150 );
		drawBox( window, Color.RED,  400, 400, 80, 80 );
		drawBox( window, Color.ORANGE,  100, 50, 80, 120 );
		drawBox( window, Color.CYAN,  200, 100, 120, 150 );
		drawBox( window, Color.MAGENTA,  100, 400, 120, 150 );
		drawBox( window, Color.PINK,  400, 100, 80, 80 );
		

		// draw six more boxes -- different colors, different places, different sizes
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		// add code to draw a WxH box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,w,h);
		//change the color to white 
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,h-20);
		
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
