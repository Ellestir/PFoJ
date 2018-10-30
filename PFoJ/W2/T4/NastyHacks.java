/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Nasty Hacks
* Link: https://open.kattis.com/problems/nastyhacks
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 31.10.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/
package T4;

import 	java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int n = read.nextInt();
    	
    	while(n > 0) {
    		int k = 0 - read.nextInt() + read.nextInt() - read.nextInt();
    		if(k > 0) {
    			System.out.print("advertise\n");
    		}
    		if(k < 0) {
    			System.out.print("do not advertise\n");
    		}
    		if(k == 0) {
    			System.out.print("does not matter\n");
    		}
    		n = n - 1;
    	}
    	
    	read.close();
    	
        return;
    }
}
