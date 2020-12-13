/*
 * RandomTriangles.java
 * 
 * Write a program that displays 500 colored triangles on the screen. 
 * You must choose the color of each triangle randomly by selecting random values for the amount of red, green, and blue. 
 * Then select three random points for the vertices of the triangle. 
 * Each vertex will require two random numbers: one random x-value and one random y-value. 
 * This means that each triangle requires nine random numbers.
 * Finally, put all this stuff inside a loop that repeats 500 times.
 * 
 */
import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;

public class RandomTriangles extends Canvas {
	
	public void paint(Graphics g) {
		
		int red, green, blue;
		int x1, y1;
		int x2, y2;
		int x3, y3;
		
		Random r = new Random();
		
		g.setColor(Color.black);
		g.drawRect(10,10,600,600);
		
		for (int i = 0; i < 500; i += 1)
		{
			
			red = 1 + r.nextInt(255);
			green = 1 + r.nextInt(255);
			blue = 1 + r.nextInt(255);
			
			Color myColor = new Color(red,green,blue);
			g.setColor(myColor);
			
			Polygon tri = new Polygon();
			x1 = 10 + r.nextInt(600);
			y1 = 10 + r.nextInt(600);
			tri.addPoint(x1,y1);
			
			x2 = 10 + r.nextInt(600);
			y2 = 10 + r.nextInt(600);
			tri.addPoint(x2,y2);
			
			x3 = 10 + r.nextInt(600);
			y3 = 10 + r.nextInt(600);
			tri.addPoint(x3,y3);
			
			g.fillPolygon(tri);
			
		}
	}
	
	public static void main (String[] args) {
		JFrame win = new JFrame("Random Triangles");
		win.setSize(700,700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new RandomTriangles());
		win.setVisible(true);
	}
}

