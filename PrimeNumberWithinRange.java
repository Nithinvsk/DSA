package dsa;

import java.util.*;
public class PrimeNumberWithinRange {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
       // System.out.println("Enter the test cases : ");
        int t = nt.nextInt();
        while(t-- > 0) {
        	//System.out.println("Enter the First Number : ");
            int n = nt.nextInt();
            //System.out.println("Enter the Second Number : ");
            int m = nt.nextInt();
            int i,j;
            for(i=n;i<=m;i++) {
                int count = 0;
                for(j=1;j<=i;j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }
}
