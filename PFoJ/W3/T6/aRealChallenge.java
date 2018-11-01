package T6;

import Java.util.Scanner;
import java.lang.*;

class aRealChallenge
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        long size = read.nextLong();
        read.close();
        
        long double perimeter = 0.0;
        perimeter = Math.sqrt(size.doubleValue());
        perimeter *= 4.0;
        System.out.println(perimeter);
        
        
    }
}
