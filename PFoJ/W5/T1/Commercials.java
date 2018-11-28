/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Commercials
* Link: https://open.kattis.com/contests/xcms3s/problems/commercials
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 15.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.util.Scanner;

public class Commercials {
	
	public static void main (String [] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n = read.nextInt();
		int p = read.nextInt();
		read.nextLine();
		
		int[] profit = new int[n];
		
		for (int i=0; i<n; i++) {
			profit[i]=read.nextInt()-p;
		}
		
		read.close();
		
		int result=0;
		int vergleich=0;
		
		for (int l=0; l<n; l++) {
			for (int r=n; r>l; r--) {
				for (int i=l; i<r; i++)
				vergleich+=profit[i];
				if (vergleich>result) {
					result=vergleich;	
				}
				vergleich=0;
			}
		}
		
		System.out.print(result);
	}
}
