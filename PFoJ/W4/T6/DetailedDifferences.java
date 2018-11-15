/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Detailed Differences
* Link: https://open.kattis.com/problems/detaileddifferences
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

public class DetailedDifferences {
	
	public static void main (String [] args) {
		
		Scanner read = new Scanner(System.in);
		
		int testCases = read.nextInt();
		
		//[][0] und [][1] fr das input paar, [][2] fr den output
		String[][] input = new String [testCases][3];
		
		for (int i=0; i<testCases; i++) {
			
			input[i][0]=read.next();
			input[i][1]=read.next();
			input[i][2]="";
			
			for (int j=0; j<input[i][0].length(); j++) {
				if (input[i][0].charAt(j)==input[i][1].charAt(j)) {
					input[i][2]+= ".";
				} else {
					input[i][2]+="*";
				}
			}
			
			System.out.println(input[i][0]);
			System.out.println(input[i][1]);
			System.out.println(input[i][2]+"\n");
		}
		
		read.close();
		
		
	}

}
