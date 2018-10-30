/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Sibice
* Link: https://open.kattis.com/problems/sibice
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

import java.util.Scanner;
public class Sibice {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int n = read.nextInt();
    	int w = read.nextInt();
    	int h = read.nextInt();
    	
    	double max = Math.sqrt((w*w)+(h*h));
    	
    	while(n > 0) {
    		int l = read.nextInt();
    		if(l > max) {
    			System.out.print("NE\n");
    		}
    		else {
    			System.out.print("DA\n");
    		}
    		n = n - 1;
    	}
    	
    	read.close();
        return;
    }
}
