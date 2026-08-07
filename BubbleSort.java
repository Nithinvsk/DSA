package dsa;

import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the n : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i,j,temp;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		
		for (i=0;i<n;i++) {
			for (j=0;j<n-i-1;j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println();
			for (int num : a) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int num : a) {
			System.out.print(num+" ");
		}
	}
}
