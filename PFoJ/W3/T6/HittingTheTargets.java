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
    		public boolean hit(int a, int b) {
    			if((a >= x1) && (a <= x2) && (b >= y1) && (b <= y2)) {
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
    		public boolean hit(int a, int b) {
    			if(Math.sqrt(((a - x) * (a - x)) + ((b - y) * (b - y))) <= r) {
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
    	String s = read.nextLine();
    	
    	while(num-- > 0) {
    		s = read.nextLine();
    		String[] s_arr = s.split(" ");
    		if(s_arr[0].equals("rectangle")) {
    			rect[c_rect++] = new Rectangle(Integer.parseInt(s_arr[1]), Integer.parseInt(s_arr[2]), Integer.parseInt(s_arr[3]), Integer.parseInt(s_arr[4]));
    		
    		}
    		if(s_arr[0].equals("circle")) {
    			circ[c_circ++] = new Circle(Integer.parseInt(s_arr[1]), Integer.parseInt(s_arr[2]), Integer.parseInt(s_arr[3]));
    		}
    		
        	
    	}
    	int shot = read.nextInt(), count, shot_x, shot_y;
    	
    	while(shot-- > 0) {
    		count = 0;
    		shot_x = read.nextInt();
    		shot_y = read.nextInt();
    		for(int i = 0 ; i < c_rect ; i++) {
    			if(rect[i].hit(shot_x, shot_y)) {
    				count++;
    			}
    		}
    		for(int i = 0 ; i < c_circ ; i++) {	
    			if(circ[i].hit(shot_x, shot_y)) {
    				count++;
    			}
    			
    		}
    		System.out.print(count + "\n");
    		
    	}
    	
    	
    	
    	
    	read.close();
        return;
    }

}
