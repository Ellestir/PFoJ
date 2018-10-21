/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Ladder
* Link: open.kattis.com/problems/ladder
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

public class Ladder
{
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int h = read.nextInt();
    	double v = Math.toRadians(read.nextInt());
    	
    	double ladderLength=h/Math.sin(v);
    	int ladderAufgerundet = (int) (ladderLength+1);

    	
    	System.out.println(ladderAufgerundet);
    	System.out.println(ladderLength);
    	
    	read.close();
    }
}