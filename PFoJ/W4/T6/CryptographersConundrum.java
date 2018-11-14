/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Cryptographers Conundrum
* Link: https://open.kattis.com/problems/conundrum
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

public class CryptographersConundrum {
    public static void main(String[] args)
    {
    	
    	Scanner read = new Scanner(System.in);
    	
    	//Input
    	String s = read.next();
    	
    	//Initialization
    	int count = 0, check = 0;
    	char c;
    	
    	//check chars
    	for(int i = 0; i < s.length(); i++) {
    		c = s.charAt(i);
    		
    		//check if char needs to be replaced (if not, count up)
    		if((c != 'P' && check == 0) || (c != 'E' && check == 1) || (c != 'R' && check == 2)) {
    			count++;
    		}
    		
    		//set check for correct char
    		if(check < 2) {
    			check++;
    		}else {
    			check = 0;
    		}
    	}
    	
    	//Output
    	System.out.println(count);
   
    	read.close();
        return;
    }
}
