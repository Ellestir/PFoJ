package T6;

import java.util.Scanner;

public class IsHalloween {
	
	public static void main (String args[]) {
		
		Scanner read = new Scanner(System.in);
		String date = read.nextLine();
		if (date.equals("OCT 31") || date.equals("DEC 25")) {
			System.out.println("yup");
		} else {
			System.out.println("nope");
		}
		
		read.close();
	}

}
