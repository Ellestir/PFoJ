/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Bishops
* Link: https://open.kattis.com/contests/xcms3s/problems/bishops
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 15.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/



package T1;

import java.util.Scanner;

public class Bishops {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	while(read.hasNext()) {
    		int a = read.nextInt();
    		if(a == 1) {
    			System.out.println("1");
        			
    		}else {
    		System.out.println( ( ( a - 1 ) * 2 ) );
    		}
    	}
    	
    	read.close();
        return;
    }
}
