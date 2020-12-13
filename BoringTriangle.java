/*
 * BoringTriangle.java
 * 
 * Write a program that displays a solid purple triangle on the screen. 
 * The size and position of the triangle do not matter, but it must be purple (or some other color that isn't built-in), 
 * and you must use fillPolygon() to do it.
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

public class BoringTriangle extends Canvas {
	
	public void paint(Graphics g) {
		
		Color myPurple = new Color(167,66,244);
		g.setColor(myPurple);
		Polygon tri = new Polygon();
		tri.addPoint(100,100);
		tri.addPoint(275,275);
		tri.addPoint(50,300);
		
		g.fillPolygon(tri);
	
	}
	
	public static void main (String[] args) {
		
		JFrame win = new JFrame("Boring Triangle");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new BoringTriangle());
		win.setVisible(true);
		
	}
}

