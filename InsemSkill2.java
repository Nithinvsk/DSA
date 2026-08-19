package dsa;

import java.util.*;
public class InsemSkill2 {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		System.out.println("Enter the test cases : ");
		int t = nt.nextInt();
	
		while(t-->0) {
			System.out.println("Enter the n : ");
			int n = nt.nextInt();
			int a[] = new int[n],i,count=0;
			for(i=0;i<n;i++) {
				a[i] = nt.nextInt();
			}
			for(i=0;i<n;i++) {
				if (a[i] != 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
