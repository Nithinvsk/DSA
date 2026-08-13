package dsa;

import java.util.*;
public class AntimedianDeletion {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        int t = nt.nextInt();
        while (t-- > 0) {
            int n = nt.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) { 
            	a[i] = nt.nextInt();
            }
            
            StringBuilder str = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                int left = i,
                right = n - 1 - i;
                int answer;
                
                if (n == 1) {
                    answer = 1;
                }
                else if (left == 0 || right == 0) {
                    answer = 2;
                }
                else {
                    answer = 2 * Math.min(left, right);
                }
                if (i > 0) { 
                	str.append(" ");
                }
                str.append(answer);
            }
            System.out.println(str);
        }
	}
}
