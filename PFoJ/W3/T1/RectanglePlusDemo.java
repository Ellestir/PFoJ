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

public class RectanglePlusDemo 
{
	public static void main(String[] args) 
	{
		RectanglePlus objectA = new RectanglePlus();
		RectanglePlus objectB = new RectanglePlus(new Point(1, 1));
		RectanglePlus objectC = new RectanglePlus(2, 3);
		RectanglePlus objectD = new RectanglePlus(new Point(2, 2), 3, 1);
		
		System.out.println("Object A Area: " + objectA.getArea());
		System.out.println("Object B Area: " + objectB.getArea());
		System.out.println("Object C Area: " + objectC.getArea());
		System.out.println("Object D Area: " + objectD.getArea());
		System.out.println("Object A Hash Code: " + objectA.hashCode());
		System.out.println("Object B Hash Code: " + objectB.hashCode());
		System.out.println("Object C Hash Code: " + objectC.hashCode());
		System.out.println("Object D Hash Code: " + objectD.hashCode());
		System.out.println("Object A is larger than Object B: " + objectA.isLargerThan(objectB));
		System.out.println("Object B is larger than Object A: " + objectB.isLargerThan(objectA));
		System.out.println("Object C is larger than Object D: " + objectC.isLargerThan(objectD));
		System.out.println("Object D is larger than Object C: " + objectC.isLargerThan(objectD));
		System.out.println("Object A String: " + objectA.toString());
		System.out.println("Object B String: " + objectB.toString());
		System.out.println("Object C String: " + objectC.toString());
		System.out.println("Object D String: " + objectD.toString());
		System.out.println("Object A Class: " + objectA.getClass());
		System.out.println("Object B Class: " + objectB.getClass());
		System.out.println("Object C Class: " + objectC.getClass());
		System.out.println("Object D Class: " + objectD.getClass());
		System.out.println("Object A equals Object B: " + objectA.equals(objectB));
		System.out.println("Object B equals Object A: " + objectB.equals(objectA));
		System.out.println("Object C equals Object D: " + objectC.equals(objectD));
		System.out.println("Object D equals Object C: " + objectD.equals(objectC));
		objectA.move(2, 5);
		System.out.println("Object A was moved to 2 5.");
	}
}