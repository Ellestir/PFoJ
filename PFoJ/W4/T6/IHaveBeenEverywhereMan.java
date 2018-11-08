/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: I've Been Everywhere, Man
* Link: https://open.kattis.com/contests/ntt8xa/problems/everywhere
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Ro.enberger (1208597)
* @version 1.0, 08.11.2018
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/

package T6;

import java.util.Scanner;
import java.util.*;

class IHaveBeenEverywhereMan
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int testcases = read.nextInt();
        for (int i = 0; i < testcases; i++)
        {
            int trips = read.nextInt();
            List<String> listWithDuplicates = new List<String>();
            for (int j = 0; j < trips; j++)
            {
                listWithDuplicates.add(read.nextLine());
            }
            List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
            int size = listWithoutDuplicates.size();
            System.out.println(size);
        }
        
        
        read.close();
    }
}
