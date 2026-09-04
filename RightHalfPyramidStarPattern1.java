package dsa;

import java.util.*;
public class RightHalfPyramidStarPattern1 {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = nt.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++) {
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
