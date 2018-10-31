/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Task	2 - Bicycle
* Link: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 31.10.18
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T2;

public class Main {

	public static void main(String[] args) 
	{
		//Create Mountainbike Object
		MountainBike bike = new MountainBike(50, 5, 0, 10);
		System.out.println("MountainBike set up");
		bike.setCadence(10);
		System.out.println("Set Cadence to "+ bike.cadence);
		bike.setGear(12);
		System.out.println("Set Gear to "+ bike.gear);
		bike.setHeight(40);
		System.out.println("Set seatHeight to "+ bike.seatHeight);
		bike.speedUp(25);
		System.out.println("Speed up to "+ bike.speed + " speed");
		bike.applyBrake(20);
		System.out.println("Brake to "+ bike.speed + " speed");
		System.out.println("End of MountainBike");
		System.out.println("");
		
		//Create Bicycle Object
		Bicycle bicycle = new Bicycle(5, 0, 13);
		System.out.println("Bicycle set up");
		bicycle.speedUp(50);
		System.out.println("Speed up to "+ bicycle.speed + " speed");
		bicycle.setGear(15);
		System.out.println("Set Gear to "+ bicycle.gear);
		bicycle.setCadence(8);
		System.out.println("Set Cadence to "+ bicycle.cadence);
		bicycle.applyBrake(20);
		System.out.println("Brake to "+ bicycle.speed + " speed");
		System.out.println("End of Bicycle");
		
		
	}

}
