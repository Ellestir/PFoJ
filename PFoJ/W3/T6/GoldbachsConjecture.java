/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Goldbachs Conjecture
* Link: https://open.kattis.com/problems/goldbach2
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 07.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class GoldbachsConjecture {
	
	public static boolean isPrime(int i) {
		for(int j = 2; j < i ; j++) {
			if(i%j == 0) {
				return false;
			}
		}
		return true;
	}
	
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);

//Initialization
    	int 	num = read.nextInt(), 												//number of cases
    			count,																//counter for representations
    			count2 = 0,
    			x,																	//input to check
    			y,																	//current possible solution to check
    			i;																	//output counter
    	int[] 	a, primes;																	//list of representations (only smaller addend is saved)
    	a = new int[1500];
    	primes = new int[3432];
    	
    	for(int j = 2; j < 32001; j++) {
    		if(isPrime(j)) {
    			primes[count2++] = j;
    		}
    	}

    	while(num-- > 0) {	
//Input
    		x = read.nextInt();														//next input

    		count2 = 0;
	    	y = primes[0];																//reset y
	    	count = 0;
//Check for representations    		
	    	while(y <= (x / 2) ) {			
	    		if(Arrays.binarySearch(primes, (x-y)) > -1 ) {
	    			a[count++] = y;
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	   			y = primes[++count2];														//go to next possible solution
	   		}
//Output    		
    		System.out.print(x + " has " + count + " representation(s)\n");
    		for(i = 0; i < count; i++) {
    			System.out.print(a[i] + "+" + (x - a[i]) + "\n");
    		}
    		
   		}
   		System.out.print("\n");
    
   	
    	read.close();
        return;
    }

}
