package com.chandu.algo;

import java.util.Arrays;
import java.util.Scanner;

/* Java program for Merge Sort */
public class MergeSort {
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int first, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - first + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[first + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = first;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				//System.err.println(Arrays.toString(arr));
				i++;
			} else {
				arr[k] = R[j];
				//System.out.println(Arrays.toString(arr));
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arSize = sc.nextInt();
		int[] arr = new int[arSize];
		for (int i = 0; i < arSize; i++) {
			arr[i] = sc.nextInt();
		}
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array"+Arrays.toString(arr));
		
	}
}
/* This code is contributed by Rajat Mishra */
