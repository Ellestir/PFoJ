/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Overriding and Hiding Methods
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

package T5;

import java.time.*;
import java.lang.*;
import java.util.*;

import T4.Cat;

public class SimpleTimeClient implements TimeClient {
    
    private LocalDateTime dateAndTime;
    
    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }
    
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }
    
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }
    
    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }
    
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }
    
    public String toString() {
        return dateAndTime.toString();
    }
    
    //Used to clone object
    public TimeClient clone (TimeClient newTimeClient) throws CloneNotSupportedException
    {
    	TimeClient clonedObj = (TimeClient) super.clone();
    	return clonedObj;
    }
    //Used to clone object
    public SimpleTimeClient clone (SimpleTimeClient newTimeClient) throws CloneNotSupportedException
    {
    	SimpleTimeClient clonedObj = (SimpleTimeClient) super.clone();
    	return clonedObj;
    }
    
    
    public static void main(String... args) 
    {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
        System.out.println(myTimeClient.getLocalDateTime());
        myTimeClient.setTime(0, 0, 0);
        System.out.println("Set Time to 0!");
        System.out.println(myTimeClient.toString());
        myTimeClient.setDate(1, 1, 1);
        System.out.println("Set Date to 1-1-1!");
        System.out.println(myTimeClient.toString());
        myTimeClient.setDateAndTime(1, 1, 1, 0, 0, 0);
        System.out.println("Set Time to 0 and Date to 1-1-1!");
        System.out.println(myTimeClient.toString());
        
        TimeClient newTimeClient;
        try 
        {
			newTimeClient = myTimeClient.clone(myTimeClient);
	        System.out.println("Cloned myTimeClient");
	        System.out.println("myTimeClient equals newTimeClient: " + myTimeClient.equals(newTimeClient));
        } 
        catch (CloneNotSupportedException e) 
        {
			e.printStackTrace();
		}
        System.out.println("Class of myTimeClient: " + myTimeClient.getClass());
        System.out.println("Hashcode of myTimeClient: " + myTimeClient.hashCode());
        System.out.println("MyTimeClient in string: " + myTimeClient.toString());
        
    }
}