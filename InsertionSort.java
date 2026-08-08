package dsa;

import java.util.*;
public class InsertionSort {
	public static void main(String[] args) {
		Scanner nt = new Scanner(System.in);
		System.out.print("Enter the n : ");
		int  n = nt.nextInt();
		
		int a[] = new int[n],i,j,temp;
		for (i=0;i<n;i++) {
			System.out.printf("Number %d : ",i+1);
			a[i] = nt.nextInt();
		}
		
		for (i=1;i<n;i++) {
			temp = a[i];
			j = i-1;
			while(j >= 0 && a[j] > temp) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
		
		for(int arr : a) {
			System.out.print(arr+" ");
		}
	}
}
