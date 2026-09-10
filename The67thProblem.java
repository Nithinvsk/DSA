package dsa;

import java.util.*;
public class The67thProblem {
	 public static void main(String[] args) {
	        Scanner nt = new Scanner(System.in);
	        
	        int n = nt.nextInt();
	        
	        while (n-- > 0) {
	            int c = nt.nextInt();
	            
	            int value;
	            
	            if (c == 67) {
	                value = 67; // cannot exceed limit
	            } else {
	                value = c + 1;
	            }
	            
	            System.out.println(value);
	        }
	    }
}
