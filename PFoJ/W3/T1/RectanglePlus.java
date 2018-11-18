/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Implementing and Interface
* Link: exercises03.pdf
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 05.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T1;

public class RectanglePlus 
implements Relatable, Cloneable
{
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	public RectanglePlus clone() throws CloneNotSupportedException
	{
		RectanglePlus clonedObj = (RectanglePlus) super.clone();
		return clonedObj;
	}
	
	// four constructors
	public RectanglePlus() 
	{
	    origin = new Point(0, 0);
	}
	public RectanglePlus(Point p) 
	{
	    origin = p;
	}
	public RectanglePlus(int w, int h) 
	{
	    origin = new Point(0, 0);
	    width = w;
	    height = h;
	}
	public RectanglePlus(Point p, int w, int h) 
	{
	    origin = p;
	    width = w;
	    height = h;
	}
	
	// a method for moving the rectangle
	public void move(int x, int y) 
	{
	    origin.x = x;
	    origin.y = y;
	}
	
	// a method for computing
	// the area of the rectangle
	public int getArea() 
	{
	    return width * height;
	}
	
	// a method required to implement
	// the Relatable interface
	public int isLargerThan(Relatable other) 
	{
	    RectanglePlus otherRect 
	        = (RectanglePlus)other;
	    if (this.getArea() < otherRect.getArea())
	        return -1;
	    else if (this.getArea() > otherRect.getArea())
	        return 1;
	    else
	        return 0;               
	}
}