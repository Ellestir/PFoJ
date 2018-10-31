/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Planina
* Link: https://open.kattis.com/problems/planina
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

public class Planina {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int n = read.nextInt();
    	int k = (int) Math.pow(2, n) + 1;
    	k = k * k;
    	
    	System.out.print(k);
    	read.close();
        return;
    }
}
