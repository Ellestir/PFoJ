/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Eight Queens
* Link: https://open.kattis.com/contests/xcms3s/problems/8queens
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 21.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/


package T6;

import java.util.Scanner;

public class EightQueens {
    public static void main ( String[] args )
    {
    	Scanner read = new Scanner ( System.in );
    	
    	int[][] board = new int[8][8];
    	int sum;
    	
    	
    	//input
    	for ( int i = 0 ; i < 8 ; i++ )
    	{
    		String s = read.nextLine();
    		for ( int j = 0 ; j < 8 ; j++ ) {
    			if(s.charAt(j) == '*')
    			{
    				board[j][i] = 1;
    			}
    			else 
    			{
    				board[j][i] = 0;
    			}
    		}
    	}

    	//check rows
    	for ( int i = 0 ; i < 8 ; i++)
    	{
    		sum = 0;
    		for( int j = 0 ; j < 8 ; j++ )
    		{
    			sum = sum + board[j][i];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	//check columns
    	for ( int i = 0 ; i < 8 ; i++)
    	{
    		sum = 0;
    		for( int j = 0 ; j < 8 ; j++ )
    		{
    			sum = sum + board[i][j];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	
    	for ( int i = 0 ; i < 8 ; i++)
    	{
    		sum = 0;
    		for ( int j = 0 ; j < (8 - i) ; j++ )
    		{
    			sum = sum + board[i + j][j];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	for ( int i = 0 ; i < 8 ; i++)
    	{
    		sum = 0;
    		for ( int j = 0 ; j < (8 - i) ; j++ )
    		{
    			sum = sum + board[j][i + j];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	for ( int i = 0 ; i < 8 ; i++)
    	{
    		sum = 0;
    		for ( int j = 0 ; j < i ; j++ )
    		{
    			sum = sum + board[i - j][7 - j];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	for ( int i = 0 ; i < 8 ; i++)
    	{
    		sum = 0;
    		for ( int j = 0 ; j < i ; j++ )
    		{
    			sum = sum + board[j][i - j];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	//end
    	System.out.println("valid");
    	read.close();
        return;
    }
}