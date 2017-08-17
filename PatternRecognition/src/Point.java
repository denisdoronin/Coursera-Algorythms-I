import edu.princeton.cs.algs4.StdDraw;
import java.util.Comparator;

public class Point implements Comparable<Point>
{
    private final int x;     // x-coordinate of this point
    private final int y; // y-coordinate of this point
	
	public final Comparator<Point> slopeOrder()
    {
		
    }
	
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
    	
    	return result;
    }
    public double slopeTo(Point pnt)
    {
    	int result = 0;
    	
    	return result;
    }

}
