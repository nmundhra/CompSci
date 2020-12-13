/*
 * ClockFace.java
 * Make a graphics program that displays the face of an analog clock on the screen. 
 * There must be a circle containing two "hands", one longer and one shorter. 
 * Around the inside of the circle, you must have numeric labels at 12, 3, 6, and 9.
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas {
	
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.drawOval(100,100,200,200);
		
		g.setFont(new Font("Courier",Font.BOLD,18));
		g.drawString("12",200,118);
		g.drawString("3",280,200);
		g.drawString("6",200,285);
		g.drawString("9",115,200);
		
		g.setColor(Color.red);
		g.fillOval(195,195,10,10);
		
		g.setColor(Color.black);
		g.drawLine(198,198,110,198);
		g.drawLine(198,198,130,220);
		
	}
	
	public static void main (String[] args) {
		JFrame win = new JFrame("Clock Face");
		win.setSize (800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockFace canvas = new ClockFace();
		win.add(canvas);
		win.setVisible(true);
	}
}

