/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: Hitting the Targets
* Link: https://open.kattis.com/problems/hittingtargets
* @author Fabian Grun (1230840)
* @author Selin Can (1101908)
* @author Tom Rosenberger (1208597)
* @version 1.0, <Add date here>
*
* Method : <Add method name>
* Status: <Add status>
* Runtime: <Add runtime>
*/



package T6;

import java.util.Scanner;
import java.util.Arrays;





public class HittingTheTargets {
    public static void main(String[] args)
    {
    	class Rectangle{
    		private	int x1, y1, x2, y2;
    	
    		public Rectangle(int a, int b, int c, int d) {
    		x1 = a;
    		y1 = b;
    		x2 = c;
    		y2 = d;
    		}
    		public Rectangle() {
    		x1 = 0;
    		y1 = 0;
    		x2 = 0;
    		y2 = 0;
    		}
    		public boolean hit(int a, int b) {
    			if(a > x1 && a < x2 && b > y1 && b < y2) {
    				return true;
    			}else {
    				return false;
    			}
    		}
    	
    	}
    	class Circle{
    		private int x, y, r;
    		
    		public Circle(int a, int b, int c) {
    			x = a;
    			y = b;
    			r = c;
    		}
    		public Circle() {
    			x = 0;
    			y = 0;
    			r = 0;
    		}
    		
    		public boolean hit(int a, int b) {
    			if(Math.sqrt(((a - x) * (a - x)) + ((b - y) * (b - y))) < r) {
    				return true;
    			}else {
    				return false;
    			}
    		}
    	}
    	
    	Scanner read = new Scanner(System.in);
    	
    	Rectangle[]	rect;
    	Circle[]	circ;
    	rect = new Rectangle[30];
    	circ = new Circle[30];
    	int c_rect = 0, c_circ = 0, num = read.nextInt();
    	Byte s;
    	for(int i = 0; i < num ; i++) {
    		s = read.nextByte();
    		System.out.print(s);
    	}
    	
    	
    	
    	
    	read.close();
        return;
    }

}
