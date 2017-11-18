import edu.princeton.cs.algs4.StdDraw;
import java.util.Comparator;

public class Point implements Comparable<Point>
{
    private final int x;     // x-coordinate of this point
    private final int y; // y-coordinate of this point
	
    private class SlopeComparator implements Comparator<Point>
    {
    	public int compare(Point p1, Point p2)
    	{
    		int result = 0;
    		double slope1 = slopeTo(p1);
    		double slope2 = slopeTo(p2);
    		
    		if(slope1 < slope2)
    			result = -1;
    		else if (slope1 > slope2)
    			result = 1;
    		
    		return result;
    	}
    }
    
	public final Comparator<Point> SLOPE_ORDER = new SlopeComparator();
    
	
	public Point(int x, int y) 
	{
	       /* DO NOT MODIFY */
	       this.x = x;
	       this.y = y;
	}
    public void draw()
    {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }
	
    public void drawTo(Point that) 
    {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }
    
    public int compareTo(Point pnt)
    {
    	int result = 0;
    	
    	result = y - pnt.y;
    	if(result == 0)
    	{
    		result = x - pnt.x;
    	}    	
    	return result;
    }
    public double slopeTo(Point pnt)
    {
    	double result = 0;
    	
    	if(x == pnt.x)
    	{
    		if(y == pnt.y) 
    			result = Double.NEGATIVE_INFINITY;
    		else
    			result = Double.POSITIVE_INFINITY;
    	}
    	else 
    	{
    		result = (pnt.y - y)/(pnt.x - x);
    	}
    	
    	return result;
    }
    
    public int getx() {return x;}
    public int gety() {return y;}

}
