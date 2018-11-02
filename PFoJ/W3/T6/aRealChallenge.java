package T6;

import java.util.Scanner;
import java.lang.Math;

class aRealChallenge
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        long size = read.nextLong();
        read.close();
        
        double perimeter= 0.0;
        perimeter = Math.sqrt((double)size);
        perimeter *= 4.0;
        System.out.println(perimeter);
        
        
    }
}
