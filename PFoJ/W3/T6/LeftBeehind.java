/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Left Beehind
* Link: https://open.kattis.com/problems/leftbeehind
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

public class LeftBeehind {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		int a = read.nextInt() , b = read.nextInt(), count = 15;
		if(a != 0 || b !=0) {
			do {
				if(a + b == 13){
					System.out.print("Never speak again.\n");
				}
				if(a + b != 13){
					if(a > b) {
						System.out.print("To the convention.\n");
					}
					if(a == b) {
						System.out.print("Undecided.\n");
					}
					if(a < b) {
						System.out.print("Left beehind.\n");
					}
				}
				a = read.nextInt();
				b = read.nextInt();
				count--;
			}while((a != 0 ||  b != 0) && count != 0);
		}
		read.close();
		return;
    }
}
