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

import T2.Bicycle;

public class MountainBike extends Bicycle 
{
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) 
    {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) 
    {
        seatHeight = newValue;
    }   

}
