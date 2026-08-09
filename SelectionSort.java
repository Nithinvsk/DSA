package dsa;

import java.util.*;
public class SelectionSort {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		
		System.out.print("Enter the n : ");
		int n = nt.nextInt();
		
		int a[] = new int[n],i,j,temp,minIndex=-1;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		
		for (i=0;i<n-1;i++) {
			minIndex = i;
			for (j=i+1;j<n;j++) {
				if (a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		
		for (int num : a) {
			System.out.print(num+ " ");
		}
	}
}
