/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Stuck In A Time Loop
* Link: open.kattis.com/problems/timeloop
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 21.10.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/
package oop;

import java.util.Scanner;

public class StuckInATimeLoop
{
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int n = read.nextInt();
    	
    	int counter=1;
    	for (int i=n; i>0; i--) {
    		
    		System.out.print(counter++);
    		System.out.print(" Abracadabra\n");
    	}
    	    	
    	read.close();
    }
}

