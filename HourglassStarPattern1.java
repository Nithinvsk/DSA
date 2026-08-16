package dsa;

import java.util.*;
public class HourglassStarPattern1 {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = nt.nextInt();
        int i,j,k,p,q,r;
        for(p=n;p>0;p--) {
            for(q=1;q<=n-p;q++) {
                System.out.print(" ");
            }
            for(r=1;r<=2*p-1;r++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for(i=2;i<=n;i++) {
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
