/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Kitten On A Tree
* Link: https://open.kattis.com/contests/xcms3s/problems/kitten
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 17.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.util.Scanner;
import java.util.HashMap;

public class KittenOnATree {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
	
		HashMap<String, String> map = new HashMap<>();
		
		String kitten = read.nextLine();
		
		//read.nextLine();
		
		String abbruch = "";
		
		do {
			
			String input = read.nextLine();
			abbruch=input;
			
			String[] branches = input.split(" ");
			
			for (int i = 1; i < branches.length; i++) {
				map.put(branches[i], branches[0]);
			}
			
			
			
		} while (!abbruch.equals("-1"));
		
		while (true){
			System.out.print(kitten + " ");
			
			if (!map.containsKey(kitten))
				break;
			
			kitten = map.get(kitten);
		}
		
		read.close();
	}
}
