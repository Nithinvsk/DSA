package dsa;

import java.util.*;
public class The67th67Problem {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        
        int t = nt.nextInt();
        
        while (t-- > 0) {
            int a[] = new int[7];
            
            int sum = 0;
            int m = Integer.MIN_VALUE;
            
            for (int i = 0; i < 7; i++) {
                a[i] = nt.nextInt();
                sum += a[i];
                if (a[i] > m) {
                    m = a[i];
                }
            }
            
            int res = -sum + 2 * m;
            
            System.out.println(res);
        }
    }
}
