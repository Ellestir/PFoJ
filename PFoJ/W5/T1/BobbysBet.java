/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Bobbys Bet
* Link: https://open.kattis.com/contests/xcms3s/problems/bobby
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 21.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T1;

import java.util.Scanner;

public class BobbysBet {
	
	public static double binomialCoefficient ( int n , int k )
	{
		double a = 1;
		
		for ( int i = 1 ; i <= n ; i++ )
		{
			a = a * i;
		}
		
		for ( int i = 1 ; i <= k ; i++ )
		{
			a = a / i;
		}
		
		for ( int i = 1 ; i <= (n - k) ; i++ )
		{
			a = a / i;
		}
		
		return a;
	}
	
	public static double probWinNOfM ( int sides , int to_reach , int n , int m )
	{
		double a = binomialCoefficient ( m , n);
		
		//the multiplication of the probabilities is split into numerators and denominators to counter rounding errors:

		//multiply numerators					
		for ( int i = 0 ; i < n ; i++ ) 
		{
			a = a * (sides + 1 - to_reach );
		}
		
		for ( int i = 0 ; i < (m - n) ; i++ ) 
		{
			a = a * (to_reach - 1);
		}
		//divide by denominators				
		for ( int i = 0 ; i < m ; i++ )
		{
			a = a / sides;
		}
		
		return a;
	}
	
	public static double probWinMinNOfM ( int sides , int to_reach , int n , int m )
	{
		double a = 0;
		
		for ( int i = n ; i <= m ; i++ )
		{
			a = a + probWinNOfM ( sides , to_reach , i , m );
		}
		
		return a;
	}
	
	public static double expectedReturn ( int profit , int sides , int to_reach , int n , int m )
	{
		double a = probWinMinNOfM ( sides , to_reach , n , m ) * (double) profit /*- ( 1 - probWinMinNOfM ( sides , to_reach , n , m ))*/;
		
		return a;
	}
	
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
    		
    		//output
    		if( expectedReturn ( profit, sides , to_reach , min_count , max_count ) > 1 )
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
