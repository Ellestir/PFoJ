/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Unlock Pattern
* Link: https://open.kattis.com/problems/unlockpattern
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 08.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.util.Scanner;


public class UnlockPattern {
	public static void main(String[] args)
    {
		
		Scanner read = new Scanner(System.in);
		
		double[] x, y;
		x = new double[9];
		y = new double[9];
		int num;
		double len = 0;
		
		for(int i = 0; i < 3 ; i++) {		//save coordinates
			for(int j = 0; j < 3; j++) {
				num = read.nextInt();
				x[num - 1] = (double) j;
				y[num - 1] = (double) i;
			}
		}
		
		for(int i = 0; i < 8; i++) {
			len = len + (Math.sqrt(((x[i] - x[(i + 1)]) * (x[i] - x[(i + 1)])) + ((y[i] - y[(i + 1)]) * (y[i] - y[(i + 1)]))));
		}
		
		System.out.print(len);
		
		read.close();
        return;
    }
}
