package dsa;

import java.util.*;
public class AlphabetPalindromicPyramid1 {
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
                char ch = (char) ('A' + k-1);
                System.out.print(ch);
            }
            for(m=i-1;m>=1;m--) {
                char ch = (char) ('A' + m-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
