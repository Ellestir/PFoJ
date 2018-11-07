/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Heliocentric
* Link: https://open.kattis.com/problems/heliocentric
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 07.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/


package T6;

import java.util.Scanner;

public class Heliocentric {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	int e, m, count, num = 1;
    	
    	while(read.hasNextInt()) {
    		e = read.nextInt();
    		m = read.nextInt();
    		if(m == 0) {
    			count = 0;
    		}else {
    			count = 687 - m;
    		}
    		e = (e + count) % 365;
    		while(e != 0) {
    			e = (e + 687) % 365;
    			count = count + 687;
    		}
    		System.out.print("Case "+(num++)+": "+count+"\n");
    		
    	}
    	
    	
    	
    	read.close();
        return;
    }
}

