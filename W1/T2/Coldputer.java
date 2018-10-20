package oop;

import java.util.Scanner;

public class Coldputer {
	
	public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	
    	int n = read.nextInt();
    	int countColdDays=0;
    	
    	
    	while (n>0) {
    		
    		int t = read.nextInt();
    		
    		if (t<0) countColdDays++;
    		
    		n--;
    	};
    	
    	System.out.println(countColdDays);
    	
    	read.close();
    	
        return;
    }

}
