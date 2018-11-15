/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Apaxiaaaaaaaaaaaans!
* Link: https://open.kattis.com/contests/ntt8xa/problems/apaxiaaans
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 14.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/



package T6;

import java.util.Scanner;


public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args)
    {
    	//initialize input scanner
    	Scanner read = new Scanner(System.in);
    	
    	//input long name
    	String name_long = read.nextLine();
    	
    	//initialize check variables
    	char last = name_long.charAt(0);
		char next;
		
		//initialize new name
		String name_short = "" + last;
		
		//create output
    	for(int i = 1; i < name_long.length(); i++) {
    		//get next char in old name
    		next = name_long.charAt(i);
    		
    		//append char to new name if different to last char 
    		if(next != last) {
    			name_short = name_short + next;
    			last = next;
    		}
    	}
    	
    	//output new name
    	System.out.print(name_short);
    	
    	//end
    	read.close();
        return;
    }

}
