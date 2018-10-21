package oop;

/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: <Add problem here>
* Link: <Add link here>
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, <Add date here>
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

import java.util.Scanner;

public class Ladder
{
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int h = read.nextInt();
    	double v = Math.toRadians(read.nextInt());
    	
    	double ladderLength=h/Math.sin(v);
    	int ladderAufgerundet = (int) (ladderLength+1);
    	//ladderAufgerundet++;
    	
    	System.out.println(ladderAufgerundet);
    	System.out.println(ladderLength);
    	
    	read.close();
        return;
    }
}