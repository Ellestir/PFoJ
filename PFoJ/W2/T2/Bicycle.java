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

public class Bicycle 
{
    
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) 
    {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) 
    {
        cadence = newValue;
    }
        
    public void setGear(int newValue) 
    {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) 
    {
        speed -= decrement;
    }
        
    public void speedUp(int increment) 
    {
        speed += increment;
    }
        
}