package dsa;

import java.util.*;
public class InsemLab1 {
	    static void merge(int a[], int low, int mid, int high) {
	        int n1 = mid - low + 1;
	        int n2 = high - mid;

	        int[] left = new int[n1];
	        int[] right = new int[n2];

	        for (int i = 0; i < n1; i++) {
	            left[i] = a[low + i];
	        }

	        for (int j = 0; j < n2; j++) {
	            right[j] = a[mid + 1 + j];
	        }

	        int i = 0, j = 0;
	        int k = low;

	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j]) {
	                a[k] = left[i];
	                i++;
	            } else {
	                a[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            a[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            a[k] = right[j];
	            j++;
	            k++;
	        }
	    }

	    static void mergeSort(int a[], int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;

	            mergeSort(a, low, mid);
	            mergeSort(a, mid + 1, high);

	            merge(a, low, mid, high);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        int[] a = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Number " + (i + 1) + ": ");
	            a[i] = sc.nextInt();
	        }

	        mergeSort(a, 0, n - 1);

	        System.out.println("Sorted array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
}
