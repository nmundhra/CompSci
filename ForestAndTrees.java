/*
 * ForestAndTrees.java
 * 
 * For this assignment, you need to write two functions.
 * public void drawTree( Graphics g, int x, int y )
 * this functions must draw a tree on the screen. Use a brownish rectangle for the trunk, and a green triangle (using fillPolygon()) 
 * for the branches. You should make it so that x is the left-most part of the branches, and y is the tallest part of the tree. 
 * You should make each tree relatively small.
 * public void drawForest( Graphics g, int x, int y, int w, int h )
 * this functions should call the drawTree() method inside a loop in order to draw many trees within a certain region on the screen. 
 * The positions of the trees within the forest should be random, but no part of any tree should extend past the boundaries given.
 * 
 */

import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class ForestAndTrees extends Canvas
{

	public void paint( Graphics g )
	{
		// draws a few single trees for testing
		drawTree(g,30,550);
		drawTree(g,100,580);
		drawTree(g,640,300);
		drawTree(g,730,370);

		// draws the first forest
		g.drawRect(10,10,500,500);
		drawForest(g,10,10,500,500);

		// draws the second forest
		g.drawRect(550,20,400,250);
		drawForest(g,550,20,400,250);

		// draws the third forest
		g.drawRect(200,530,710,160);
		// * write code here to call drawForest() with the same dimensions as the rectangle above
		drawForest(g,200,530,710,160);
	}
	
	public void drawTree( Graphics g, int x, int y )
	{
		g.setColor( new Color(134,83,0) );	// defines a brownish color

		// * write code here to draw the trunk using fillRect
		g.fillRect(x+17,y+50,16,50);

		// * write code here to create and draw a polygon for branches
		g.setColor(Color.GREEN);
		Polygon tree = new Polygon();
		tree.addPoint(x+25,y);
		tree.addPoint(x,y+75);
		tree.addPoint(x+50,y+75);
		g.fillPolygon(tree);
	}

	public void drawForest( Graphics g, int x, int y, int w, int h )
	{
		Random r = new Random();
		// creates a box to demonstrate the forest's boundary
		g.setColor(Color.black);
		g.drawRect(x,y,w,h);

		// * write code here to make a loop that repeats 100 times or so
		for (int i = 0;i < 100 ; i++ )
		{
			int a=0, b=0;
			// * write code here to give 'a' a random value from [0 , w-50],  (assuming your tree is 50px wide)
			// * write code here to give 'b' a random value from [0 , h-100], (assuming your tree is 100px tall)
			a = r.nextInt(w - 50);
			b = r.nextInt(h - 100);
			
			drawTree(g,x+a,y+b);	
		}
	}

	public static void main(String[] args)
	{
		JFrame win = new JFrame("ForestAndTrees");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ForestAndTrees() );
		win.setVisible(true);
	}

}
