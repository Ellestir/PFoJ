/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Flying Safely
* Link: https://open.kattis.com/problems/flyingsafely
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, <Add date here>
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.util.Scanner;

public class FlyingSafely {
	public static void main(String[] args)
    {
		Scanner read = new Scanner(System.in);
		
		
		
		for(int n = read.nextInt(); n != 0; n-- ) {
			int k = read.nextInt();
			int temp;
			for(int l = read.nextInt()*2; l !=0; l--) {
				temp = read.nextInt();
			}
			System.out.print(k-1 + "\n");
		}
		
		read.close();
		return;
    }
}
