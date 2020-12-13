/*
 * SmilingFace.java
 * 
 * Make a graphics program that displays a "smiley face" on the screen. The circle must be yellow. 
 * There must be a curve of a smile in the lower part of the face, and two small circles for eyes in the upper part of the face. 
 * The "mouth" should be red and the eyes should be blue.
 * 
 */
import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas {
	
	public void paint (Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillOval(100,100,150,150);
		
		g.setColor(Color.blue);
		//draw left eye
		g.fillOval(125,150,30,30);
		//draw right eye
		g.fillOval(200,150,30,30);
		//draw the mouth
		g.setColor(Color.red);
		g.drawArc(150,175,60,45,180,180);
		
		// code for grid
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
			g.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
			g.drawString( String.valueOf(Y), 28, Y );
		// lines
		g.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
			g.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
			g.drawLine(0,Y,799,Y);    // vertical
		
	}
	
	public static void main (String[] args) {
		
		JFrame win = new JFrame("Smiling Face");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SmilingFace canvas = new SmilingFace();
		win.add(canvas);
		win.setVisible(true);
	}
}

