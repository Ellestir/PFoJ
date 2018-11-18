/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Inheritance/Polymorphism
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

package T02;

import T02.Bicycle;
import T02.MountainBike;

public class TestBikes 
{
	  public static void main(String[] args)
	  {
		Bicycle bike01, bike03, bike04;
		MountainBike bike02;

		//Create Bicycle Object
	    bike01 = new Bicycle(20, 10, 1);

	    bike01.printDescription();
	    
	    //Create Mountainbike Object
	    bike02 = new MountainBike(20, 10, 5, "Dual");
	    if (bike02 instanceof MountainBike)
	    {
	  		System.out.println("MountainBike set up: ");
	  		bike02.printDescription();
	  		bike02.setCadence(10);
	  		System.out.println("Set Cadence to "+ bike02.cadence);
	  		bike02.setGear(12);
	  		System.out.println("Set Gear to "+ bike02.gear);
	  		bike02.setSuspension("Triple");
	  		System.out.println("Set Suspension to "+ bike02.getSuspension());
	  		bike02.speedUp(25);
	  		System.out.println("Speed up to "+ bike02.speed + " speed");
	  		bike02.applyBrake(20);
	  		System.out.println("Brake to "+ bike02.speed + " speed");
	  		System.out.println("End of MountainBike");
	  		System.out.println("");
	    }
  		
  		//Create RoadBike Object
  		bike03 = new RoadBike(40, 20, 8, 23);
  		if (bike03 instanceof RoadBike)
  		{
	  		System.out.println("RoadBike set up: ");
	  		bike03.printDescription();
	  		bike03.speedUp(50);
	  		System.out.println("Speed up to "+ bike03.speed + " speed");
	  		bike03.setGear(15);
	  		System.out.println("Set Gear to "+ bike03.gear);
	  		bike03.setCadence(8);
	  		System.out.println("Set Cadence to "+ bike03.cadence);
	  		bike03.applyBrake(20);
	  		System.out.println("Brake to "+ bike03.speed + " speed");
	  		System.out.println("End of RoadBike");
  		}
	    
	    try 
	    {
			bike04 = bike01.clone();
		} catch (CloneNotSupportedException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("bike01 equals Bike02: " + bike01.equals(bike02));
	    System.out.println("bike01 class: " + bike01.getClass());
	    System.out.println("bike01 hash code: " + bike01.hashCode());
	    System.out.println("bike01 to string: " + bike01.toString());
	  }
	}
