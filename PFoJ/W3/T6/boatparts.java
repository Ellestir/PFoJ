/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Boat Parts
* Link: https://open.kattis.com/problems/boatparts
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 01.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;
import java.util.Scanner;
import java.lang.String;



public class boatparts {
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int parts = read.nextInt();
		int days = read.nextInt();
		
		String [] inputList = new String[parts];
		
		for (int i=0; i<days; i++) {
			inputList[i] = read.nextLine();			
		}
		
		
		
		
		read.close();
	}

}
