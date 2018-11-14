/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Bela
* Link: https://open.kattis.com/problems/bela
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


public class Bela {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	int points = 0;
    	
    	//input number of hands
    	int num = read.nextInt();
    	
    	//input dominant hand
    	char dom = read.nextLine().charAt(1);
    	
    	//input cards
    	for(int i = 0; i < (num*4); i++) {
    		String card = read.nextLine();
    		
    		//check card value
    		if(card.charAt(0) == 'A') {
    			points = points + 11;
    		}
    		if(card.charAt(0) == 'K') {
    			points = points + 4;
    		}
    		if(card.charAt(0) == 'Q') {
    			points = points + 3;
    		}
    		if(card.charAt(0) == 'J') {
    			points = points + 2;
    			if(card.charAt(1) == dom) {
    				points = points + 18;
    			}
    		}
    		if(card.charAt(0) == 'T') {
    			points = points + 10;
    		}
    		if((card.charAt(0) == '9') && (card.charAt(1) == dom)) {
    			points = points + 14;
    		}
    		
    	}
    	
    	//Output
    	System.out.println(points);
    	

    	read.close();
        return;
    }
}
