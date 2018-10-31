/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Grass Seed
* Link: https://open.kattis.com/problems/grassseed
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

public class GrassSeed {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double c = read.nextDouble();
		int l = read.nextInt();
		
		double squareMeters=0;
		double result=0;
		
		
		for (int i=0; i<l; i++) {
			squareMeters = read.nextDouble() * read.nextDouble();
			result = result + squareMeters;
		}
		
		result=result*c;
		System.out.print(result);
		
		read.close();
	}

}
