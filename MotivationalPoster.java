/*
 * MotivationalPoster.java
 * 
 * Make a graphics program that displays a "motivational poster" featuring an image, a headline, and a tag line as shown.
 * For extra credit, make the first and last letters of the headline larger and "hang down" from the headline. 
 * Also, draw a line underneath it. 
 */
import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class MotivationalPoster extends Canvas {
	
	Image ph;
	
	public MotivationalPoster() throws Exception {
			ph = ImageIO.read(new File("bucket.jpeg"));
	}
	
	public void paint(Graphics g) {
		//draw image
		g.setColor(Color.BLACK);
		g.fillRect(0,0,1024,768);
		
		g.drawImage(ph,200,50,this);
		
		//write texts 
		g.setColor(Color.RED);
		g.setFont(new Font("Times new Roman",Font.BOLD,40));
		g.drawString("Look Like a Bucket",200,600);
		g.drawLine(200,605,550,605);
	}
	
	public static void main (String[] args) throws Exception {
		JFrame win = new JFrame("Motivational Poster");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new MotivationalPoster());
		win.setVisible(true);
	}
}

