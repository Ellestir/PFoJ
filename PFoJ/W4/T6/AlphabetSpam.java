/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Alphabet Spam
* Link: https://open.kattis.com/contests/ntt8xa/problems/alphabetspam
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

public class AlphabetSpam {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String input = read.next();
		read.close();
		int whitespaceOccurences=0;
		int uppercaseOccurences=0;
		int lowercaseOccurences=0;
		int symbolOccurences=0;
		
		for (int i=0; i<input.length(); i++) {
			
			if(input.charAt(i)==95) {
				whitespaceOccurences++;
			} else if (input.charAt(i)<=122 && input.charAt(i)>=97){
				lowercaseOccurences++;
			} else if (input.charAt(i)<=90 && input.charAt(i)>=65) {
				uppercaseOccurences++;
			} else {
				symbolOccurences++;
			}
		}
		
		System.out.println((double)whitespaceOccurences/input.length());
		System.out.println((double)lowercaseOccurences/input.length());
		System.out.println((double)uppercaseOccurences/input.length());
		System.out.println((double)symbolOccurences/input.length());
		
	}
}
