/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: How Many Digits?
* Link: https://open.kattis.com/contests/ww2rp4/problems/howmanydigits
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

import java.util.Scanner;

public class HowManyDigits 
{

    public static void main(String[] args) 
    {
        int input, output; 
        long number;
        int counter = 10000;
        Scanner read = new Scanner(System.in);
        while (read.hasNextInt() && counter != 0)
        {
            number = 1;
            counter--;
            input = read.nextInt();
            for (int i = 1; i <= input; i++)
            {
                number*=i;
            }
            output = String.valueOf(number).length();
            System.out.println(output);
            
            //clear input and output
            output = 0;
            input = 0;
        }
        read.close();
    }

}