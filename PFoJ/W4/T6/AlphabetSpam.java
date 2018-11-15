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
