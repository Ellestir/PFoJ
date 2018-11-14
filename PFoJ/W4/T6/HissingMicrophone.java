/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Hissing Microphone
* Link: https://open.kattis.com/problems/hissingmicrophone
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 31.10.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.util.Scanner;
import java.lang.String;

public class HissingMicrophone {
	
	public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	String input = read.next();
    	
    	if (input.contains("ss")) {
    		System.out.println("hiss");
    	} else {
    		System.out.println("no hiss");
    	}
    	
    read.close();
    return;
    
    }
}
