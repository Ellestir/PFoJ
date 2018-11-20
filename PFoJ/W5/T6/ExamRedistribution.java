/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Exam Redistribution
* Link: https://open.kattis.com/contests/xcms3s/problems/redistribution
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 20.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/


package T6;

import java.util.Scanner;

public class ExamRedistribution {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	//initialize variables
    	int 	num_rooms = read.nextInt(),
    			sum = 0;
    	int[][] 	rooms = new int[num_rooms][2];
    	
    	//read input
    	for ( int i = 0 ; i < num_rooms ; i++ ) {
    		rooms[i][0] = read.nextInt();
    		rooms[i][1] = i + 1;
    		sum = sum + rooms[i][0];
    	}
    	
    	//check possibilty
    	for ( int i = 0 ; i < num_rooms ; i++ ) {
    		if( rooms[i][0] > ( sum / 2 ) ) {
    			System.out.println("impossible");
    			
    			//end
    	    	read.close();
    	        return;
    		}
    	}
    	
    	//sort rooms
    	for ( int i = 1 ; i < num_rooms ; i++ ) {
    		int check = i - 1;
    		int temp;
    		while( check >= 0 ) {
    			if( rooms[check][0] < rooms[check + 1][0] ) {
	    			temp = rooms[check][0];
	    			rooms[check][0] = rooms[check + 1][0];
	    			rooms[check + 1][0] = temp;
	    			temp = rooms[check][1];
	    			rooms[check][1] = rooms[check + 1][1];
	    			rooms[check + 1][1] = temp;
	    		}
    			check--;
    		}
    	}
    	
    	//output
    	for ( int i = 0 ; i < num_rooms ; i++) {
    		System.out.print(rooms[i][1] + " ");
    	}
    	
    	//end
    	read.close();
        return;
    	
    }

}
