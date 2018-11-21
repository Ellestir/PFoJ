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
    	int count = 0;
    	
    	//input
    	for ( int i = 0 ; i < 8 ; i++ )
    	{
    		String s = read.nextLine();
    		for ( int j = 0 ; j < 8 ; j++ ) {
    			if(s.charAt(j) == '*')
    			{
    				board[j][i] = 1;
    				count++;
    			}
    			else 
    			{
    				board[j][i] = 0;
    			}
    		}
    	}
    	
    	if ( count != 8 )
    	{
    		System.out.println("invalid");
			read.close();
			return;
		}
    	//check rows
    	for ( int row = 0 ; row < 8 ; row++)
    	{
    		int sum = 0;
    		for( int col = 0 ; col < 8 ; col++ )
    		{
    			sum = sum + board[col][row];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	//check columns
    	for ( int col = 0 ; col < 8 ; col++)
    	{
    		int sum = 0;
    		for( int row = 0 ; row < 8 ; row++ )
    		{
    			sum = sum + board[col][row];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	//up left to down right, upper side
    	for ( int col = 0 ; col < 8 ; col++)
    	{
    		int sum = 0;
    		for ( int row = 0 ; row < (8 - col) ; row++ )
    		{
    			sum = sum + board[col + row][row];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	//up left to down right, downward side
    	for ( int row = 0 ; row < 8 ; row++ )
    	{
    		int sum = 0;
    		for ( int col = 0 ; col < (8 - row) ; col++)
    		{
    			sum = sum + board[col][row + col];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	//down left to up right, downward side
    	for ( int col = 0 ; col < 8 ; col++)
    	{
    		int sum = 0;
    		for ( int row = 0 ; row < (8 - col) ; row++ )
    		{
    			sum = sum + board[col + row][7 - row];
    		}
    		if(sum > 1)
    		{
    			System.out.println("invalid");
    			read.close();
    			return;
    		}
    	}
    	
    	//down left to up right, upper side
    	for ( int row = 0 ; row < 8 ; row++ )
    	{
    		int sum = 0;
    		for ( int col = 0 ; col < (8 - row) ; col++)
    		{
    			sum = sum + board[col][7 - row - col];
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