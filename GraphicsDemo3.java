/*
 * GraphicsDemo3.java
 * 
 * 1. When drawing a line, what do the four numbers represent? (starting coordinates, end coordinates)
 * 2. Make a short red line that intersects the long green line. (drawLine(50,50,50,150)
 * 3. Make a short red line that is roughly perpendicular to the diagonal "magenta" line.
 * 4. When drawing a rectangle, where on the rectangle is the starting point you provide? Use the key below. (The upper left corner);
 * 5. When drawing strings, where on the string is the starting point you provide? To the left side.
 * 6. When setting a custom font, what happens if you provide a font that doesn't exist? It will use the pre-set font or the default font.
 * 7. When setting a custom font, what happens if you provide a font that isn't installed on this machine? It will use the pre-set font or the default font.
 * 8. Change the first "Leander Lions" (the white one) to a different font. Change the blue "Leander Lions" to match it.
 * 
 */

import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo3 extends Canvas
{
    public void paint( Graphics g )
    {
        // lines
        g.setColor(Color.green);
        g.drawLine(10,100,400,100);
		g.setColor(Color.blue);
        g.drawLine(50,150,100,180);
        g.setColor(Color.magenta);
        g.drawLine(100,350,300,230);
        
        //exercise 2
		g.setColor(Color.red);
		g.drawLine(50,50,50,150);
		//exercise 3
		g.drawLine(100,150,250,400);

        g.setColor(Color.black);

        // fonts
        g.drawString("Graphics are pretty neat.", 500, 100);
        g.setFont(new Font("Consolas", Font.PLAIN, 36)); // 36-pt plain
        g.drawString("Yes, they are.", 400, 200);

        g.setColor(Color.white);
        g.setFont(new Font("Courier", Font.BOLD+Font.ITALIC, 60)); // 60-pt italic bold
        g.drawString("Leander Lions", 300, 350);

        g.setColor(Color.blue);
        g.setFont(Font.decode("Courier-BOLDITALIC-60")); // a different way to specify the same font
        g.drawString("Leander Lions", 290, 400);
        
        g.setColor(Color.black);
        g.setFont(new Font(null)); // restore default font

        int x=400, y=490;
        g.drawRect(x,y,150,20);
        g.drawString("Where is the starting point?", x,y);
        g.setColor(Color.red);
        g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo3 canvas = new GraphicsDemo3();
        win.add( canvas );
        win.setVisible(true);
    }
}

