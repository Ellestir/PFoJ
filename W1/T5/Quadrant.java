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
package oop;

import java.util.Scanner;

public class Quadrant {
	
	public static void main(String[] args) {
			
		Scanner read = new Scanner(System.in);
		
		int x = read.nextInt();
		int y = read.nextInt();
		int quadrant; 
		
		if (x>0) {
			
			if (y>0) {
				quadrant=1;
			} else {
				quadrant=4;
			}
		} else {
			
			if (y>0) {
				quadrant=2;
			} else {
				quadrant=3;
			}
		}
		System.out.println(quadrant);
		
		read.close();
	
	}
}

