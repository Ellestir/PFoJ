/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Task	1 - Classes and objects
* Link: https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 31.10.18
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T1;

public class Rectangle 
{
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() 
    {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) 
    {
        origin = p;
    }
    public Rectangle(int w, int h) 
    {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) 
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

    // a method for computing the area of the rectangle
    public int getArea() 
    {
        return width * height;
    }
}