/*
 * SmilingFaceFunction.java
 * Write a function that displays a smiling face at a certain place on the screen. 
 * The function must be named as below, and it must be able to display the face anywhere on the screen specified 
 * by the parameters x and y. 
 * You may borrow code from previous assignments if you want, although it is probably better if the face is relatively 
 * small so you have room to draw several of them on the screen at once.
 * Then, inside the paint() method, call the function a few times to draw several faces on the screen.
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas {
	
	public void paint(Graphics g) {
		
		drawSmilingFace(g, 100, 100);
		drawSmilingFace(g, 200, 300);
		drawSmilingFace(g, 100, 400);
		drawSmilingFace(g, 450, 100);
		drawSmilingFace(g, 300, 200);
		
	}
	
	public void drawSmilingFace(Graphics g, int x, int y) {
		
		// Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.

        // draw circle for the head
        g.drawOval(x,y,100,100);

        // draw eyes
        g.drawOval(x+25,y+30,10,10);
        g.drawOval(x+60,y+30,10,10);

        // draw mouth
		g.drawArc(x+25,y+60,45,20,180,180);
	}
	
	
	public static void main (String[] args) {
		Canvas canvas = new SmilingFaceFunction();
		JFrame win = new JFrame("Smiling Face Function Demo");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( canvas );
		win.setVisible(true);
	}
}

