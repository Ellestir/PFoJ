/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Bobbys Bet
* Link: https://open.kattis.com/contests/xcms3s/problems/bobby
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

public class BobbysBet {
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	//initialize variables
    	int cases, 		// # of test cases 
    		sides,		// # of sides of dice in test case
    		to_reach, 	// minimum # to reach with throw of dice
    		min_count, 	// minimum # of successful throws
    		max_count, 	// # of throws 
    		profit;		// bet multiplier in case of winning
    	
    	//input # of test cases
    	cases = read.nextInt();
    	
    	//work through cases
    	for ( int i = 0 ; i < cases ; i++ )
    	{
    		//input test case
    		to_reach = read.nextInt();
    		sides = read.nextInt();
    		min_count = read.nextInt();
    		max_count = read.nextInt();
    		profit = read.nextInt();
    		
	    		/* 		How to calculate the probabilities:
	    		probability to lose a throw 				prob_lose = ( to_reach - 1 ) / sides
	    		probability to win a throw 					prob_win = 1 - ( ( to_reach - 1 ) / sides ) 
	    		probability to lose exactly n of m throws 	prob_lose_n_of_m = ( prob_lose ^ n ) * ( prob_win ^ ( m - n ) ) * m! / (n! + (m-n)!)
	    		probability to win exactly n of m throws 	prob_win_n_of_m = ( prob_win ^ n ) * ( prob_lose ^ ( m - n ) ) * m! / (n! + (m-n)!)
	    		probability to win at least n of m throws	prob_win_min_n_of_m = sum (prob_win_k_of_m) for k > n 
	    		*/
    		
    		//calculate probability to win
    		double	prob_lose = ( (double)to_reach - 1) / sides;
    		System.out.println(prob_lose);
    		double	prob_win = 1 - prob_lose;
    		System.out.println(prob_win);
    		
    		double 	prob_sum = 0;
    		for ( int j = min_count ; j <= max_count ; j++ )
    		{
    			double factor = 1;
    			for(int k = 1; k <= max_count; k++) {
    				factor = factor * k;
    			}
    			for(int k = 1; k <= j; k++) {
    				factor = factor / (double)k;
    			}
    			for(int k = 1; k <= (max_count - j) ; k++) {
    				factor = factor / (double)k;
    			}
    			prob_sum = prob_sum + ( Math.pow( prob_win , j ) * Math.pow( prob_lose, ( (double)max_count - j ) ) * factor/* needs binomial coefficient here*/ );
    			
    		}
    		
    		//output
    		if( (( prob_sum * (double)profit ) - (1 - prob_sum) ) > 0)
    		{
    			System.out.println("yes");
    		}else
    		{
    			System.out.println("no");
    		}
    	}
    	
    	
    	//end
    	read.close();
        return;
    }
}
