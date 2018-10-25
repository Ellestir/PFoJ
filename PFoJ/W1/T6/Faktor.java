/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Quadrant
* Link: open.kattis.com/problems/quadrant
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 21.10.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.util.Scanner;


public class Faktor {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int articles = read.nextInt();
		int impact = read.nextInt();
		int bribes = articles * (impact - 1) + 1;
		System.out.println(bribes);
		
		read.close();
	}
}
