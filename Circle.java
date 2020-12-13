/*
 * Circle.java
 * 
 * Make a graphics program that displays a green filled-in circle on the screen. The size does not matter, nor does the location
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas {
	
	public void paint (Graphics g)
	{
		g.setColor (Color.green);
		g.fillOval(200,100,150,150);
	}
	
	
	public static void main (String[] args) {
		
		JFrame win = new JFrame("Circle");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Circle canvas = new Circle();
		win.add(canvas);
		win.setVisible(true);
		
	}
}

