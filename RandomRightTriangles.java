/*
 * RandomRightTriangles.java
 * 
 * Modify your previous program so that each of your 500 random triangles is the same size and shape. 
 * Choose a random color as before. Then choose a single x and y value for one vertex. 
 * Then, you must compute the positions of the other two vertices. For a right triangle (which is easiest), 
 * if the upper-left vertex is at (x,y), then the lower-left vertex will be at (x,y+50) and 
 * the lower-right vertex will be at (x+50,y+50).
 * If you don't choose your first point correctly, then part of the triangle won't fit on the screen. 
 * Make sure you choose small enough x- and y-values to make sure that all of the triangle is showing.
 * 
 */
import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;

public class RandomRightTriangles extends Canvas {
	
	public void paint(Graphics g) {
		
		int red, green, blue;
		int x1, y1;
		int x2, y2;
		int x3, y3;
		
		Random r = new Random();
		
		g.setColor(Color.black);
		g.drawRect(10,10,650,650);
		
		for (int i = 0; i < 500; i += 1)
		{
			
			red = 1 + r.nextInt(255);
			green = 1 + r.nextInt(255);
			blue = 1 + r.nextInt(255);
			
			Color myColor = new Color(red,green,blue);
			g.setColor(myColor);
			
			Polygon tri = new Polygon();
			x1 = 50 + r.nextInt(540);
			y1 = 50 + r.nextInt(540);
	//Right triangle
//			x2 = x1 + 50;
//			y2 = y1 + 50;
//			x3 = x1 + 50;
//			y3 = y1;

// isosceles triangles
			x2 = x1 - 50;
			y2 = y1 + 50;
			x3 = x1 + 50;
			y3 = y1 + 50;

			tri.addPoint(x1,y1);
			tri.addPoint(x2,y2);
			tri.addPoint(x3,y3);
			
			g.fillPolygon(tri);
			
		}
	}
	
	public static void main (String[] args) {
		JFrame win = new JFrame("Random Right Triangles Demo");
		win.setSize(700,700);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new RandomRightTriangles());
		win.setVisible(true);
	}
}

