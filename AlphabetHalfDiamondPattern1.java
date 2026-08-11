package dsa;

import java.util.*;
public class AlphabetHalfDiamondPattern1 {
	public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = nt.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                char ch = (char) ('A' + j-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        for (int k=1;k<=n;k++) {
            for(int m=1;m<=n-k;m++) {
                 char ch = (char) ('A' + m-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
