/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: ISIThalloween
* Link: https://open.kattis.com/contests/ntt8xa/problems/isithalloween
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

public class IsHalloween {
	
	public static void main (String args[]) {
		
		Scanner read = new Scanner(System.in);
		String date = read.nextLine();
		if (date.equals("OCT 31") || date.equals("DEC 25")) {
			System.out.println("yup");
		} else {
			System.out.println("nope");
		}
		
		read.close();
	}

}
