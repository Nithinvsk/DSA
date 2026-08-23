package dsa;

import java.util.*;
public class PalindromicNumberPyramid1 {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = nt.nextInt();
        int i,j,k,m;
        for(i=1;i<=n;i++) {
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++) {
                System.out.print(k);
            }
            for(m=i-1;m>=1;m--) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
