/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: RandomSeqAB
* Link: https://introcs.cs.princeton.edu/java/15inout/RandomSeq.java.html
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, 23.10.2018
*
* Method : main
* Status: Done
* Runtime: unknown
*/

package T3;

public class RandomSeqAB
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        
        int range = (b - a) + 1;
        
        for (int i = 0; i < n; i++) {
            System.out.println((int)((Math.random() * range) + a));
        }
	}
}
