package dsa;

import java.util.*;
public class CenteredIncreasingDecreasingNumberDiamond1 {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = nt.nextInt();
        for(int i=n;i>0;i--) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
         for(int i=2;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
