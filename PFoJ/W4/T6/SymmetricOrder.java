/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Symmetric Order
* Link: https://open.kattis.com/problems/symmetricorder
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


public class SymmetricOrder {
    public static void main(String[] args)
    {
    	//initialization
    	Scanner read = new Scanner(System.in);
    	int set = 1, num;
    	String[] names = new String[15];
    	
    	
    	//input num
    	while((num = Integer.parseInt(read.nextLine())) != 0) {
    		
    		int pos_high = num - 1, pos_low = 0;
    		
    		//input names
    		while(pos_low < pos_high) {
    			names[pos_low++] = read.nextLine();
    			names[pos_high--] = read.nextLine();
    		}
    		if(pos_low == pos_high) {
    			names[pos_low] = read.nextLine();
    		}
    		
    		//output set
    		System.out.println("SET " + set++);
    		for(int i = 0; i < num ; i++)
    		{
    			System.out.println(names[i]);
    		}
    		
    	}
    	
    	//end
    	read.close();
        return;
    }
}
