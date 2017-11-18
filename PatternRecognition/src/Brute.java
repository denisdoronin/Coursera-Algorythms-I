import java.util.TreeSet;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Brute 
{
	public static void main(String[] args)
	{
		boolean result = false;
		Brute b = new Brute();
		
		int[] a = new In(args[0]).readAllInts();
		Point[] points = {}; 
		
		StdDraw.setXscale(0, 32768);
		StdDraw.setYscale(0, 32768);
		
		TreeSet<Point> pts = new TreeSet<>();
		for(int i=1; i<a.length; i+=2)
		{
			pts.add(new Point(a[i], a[i+1]));
		}
		points = pts.toArray(new Point[pts.size()]);
		
		for(int i=0; i<points.length-3; i++)
		{	
			result = b.check(points[i], points[i+1], points[i+2], points[i+3]);
			if(result == true)
			{
				StdOut.printf("(%d, %d) -> (%d, %d) -> (%d, %d) -> (%d, %d)", points[i].getx(), points[i].gety(), points[i+1].getx(), points[i+1].gety(), points[i+2].getx(), points[i+2].gety(), points[i+3].getx(), points[i+3].gety());
				StdOut.println();
				points[i].drawTo(points[i+1]);
				points[i].drawTo(points[i+2]);
				points[i].drawTo(points[i+3]);
				
			}
			
		}
	}

	private boolean check(Point p, Point q, Point r, Point s)
	{
		boolean result = false;
		double slope1 = p.slopeTo(q);
		double slope2 = p.slopeTo(r);
		double slope3 = p.slopeTo(s);
		
		if((slope1 == slope2) && (slope1 == slope3) && (slope2 == slope3))
		{
			result = true;
		}
		return result;
	}
}
