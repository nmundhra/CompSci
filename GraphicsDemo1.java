/*
 * GraphicsDemo1.java
 * 
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		g.drawRect(50,20,100,100);  // draw a rectangle (x,y,w,h)
		g.fillOval(160,20,100,200); // draw a filled-in oval (x,y,w,h)
		//g.draw3DRect(360,20,100,200,true);
		g.fill3DRect(360,20,100,200,true); // draw a filled-3D Rectangle (x,y,w,h,raised)
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.setColor(Color.blue);
		g.drawOval(200,430,200,100);
		
		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100); //writes a String from (x,y) coordinates
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
		
		g.setColor(Color.red);
		g.fillRect(600,400,100,100); // draw a filled Square (x,y,w,h,raised)
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("GraphicsDemo1");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo1 canvas = new GraphicsDemo1();
		win.add( canvas );
		win.setVisible(true);
	}
}
