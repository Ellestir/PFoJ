/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: RandomSeqLotto
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

package T4;

import java.util.ArrayList;
import java.util.Collections;

public class RandomSeqLotto
{
	public static void main(String[] args) 
	{      
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<50; i++) 
        {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<6; i++) 
        {
            System.out.println(list.get(i));
        }
	}
}
