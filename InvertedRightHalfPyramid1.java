package dsa;

import java.util.*;
public class InvertedRightHalfPyramid1 {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = nt.nextInt();
        int i,j,k;
        for(i=n;i>0;i--) {
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
