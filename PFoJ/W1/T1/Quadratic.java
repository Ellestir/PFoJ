/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Quadratic
* Link: https://introcs.cs.princeton.edu/java/12types/Quadratic.java.html
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 23.10.2018
*
* Method : main
* Status: Done
* Runtime: unknown
*/

package T1;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = b*b - 4.0*c;
        if (discriminant <= 0.0)
        {
        	System.out.println("The discriminant is zero or less. Please try again!");
        }
        else
        {
	        double sqroot =  Math.sqrt(discriminant);
	
	        double root1 = (-b + sqroot) / 2.0;
	        double root2 = (-b - sqroot) / 2.0;
	
	        System.out.println(root1);
	        System.out.println(root2);
        }
	}
}
