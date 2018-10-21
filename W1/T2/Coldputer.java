/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Coldputer
* Link: open.kattis.com/problems/cold
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

public class Coldputer {
	
	public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int n = read.nextInt();
    	int countColdDays=0;
    	
    	
    	while (n>0) {
    		
    		int t = read.nextInt();
    		
    		if (t<0) countColdDays++;
    		
    		n--;
    	};
    	
    	System.out.println(countColdDays);
    	
    	read.close();
    	
        return;
    }

}
