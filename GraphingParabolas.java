/*
 * GraphingParabolas.java
 * Write code to reproduce, as accurately as possible, the following six parabolas.
 * Remember that the standard form of a parabola is y = a(x-h)² + k
 * where the vertex is at the point (h,k), and the value of a influences the direction and width.
 */

import java.awt.Color;

public class GraphingParabolas
{
	public static void main( String[] args )
	{
		double y;
		double a, h, k;

		GraphPaper gp1 = new GraphPaper(10,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp1.drawPoint(x,y);
		}

		GraphPaper gp2 = new GraphPaper(320,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			//vertex is (4,5)
			a = 1;
			h = 4; k = 5;
			y = a*Math.pow(x-h,2) + k;
			gp2.drawPoint(x,y);
		}

		GraphPaper gp3 = new GraphPaper(630,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			//vertex is (-1,-3)
			a = 0.48;
			h = -1; k = -3;
			y = a*Math.pow(x-h,2) + k;
			gp3.drawPoint(x,y);
		}

		GraphPaper gp4 = new GraphPaper(10,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 3.0;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp4.drawPoint(x,y);
		}

		GraphPaper gp5 = new GraphPaper(320,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 3.5;
			h = -3; k = 4;
			y = a*Math.pow(x-h,2) + k;
			gp5.drawPoint(x,y);
		}

		GraphPaper gp6 = new GraphPaper(630,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp6.drawPoint(x,y);
		}

	}
}


