package com.chandu.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size");
		int arSize = sc.nextInt();
		int[] arr = new int[arSize];
		System.out.println("Enter array elms");
		for (int i = 0; i < arSize; i++) {
			arr[i] = sc.nextInt();
		}
		Merge ob = new Merge();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array" + Arrays.toString(arr));

	}

	public void sort(int[] ar, int first, int last) {
		if (first < last) {
			int middle = (last + first) / 2;
			sort(ar, 0, middle);
			sort(ar, middle + 1, last);
			merge(first, middle, last, ar);
		}
	}

	public void merge(int first, int middle, int last, int[] ar) {
		int n1 = middle - first + 1;
		int n2 = last - middle;

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			arr1[i] = ar[first + i];
		for (int j = 0; j < n2; ++j)
			arr2[j] = ar[middle + 1 + j];
		
		int k = 0, l = 0;
		int m = first;

		while (k < n1 && l < n2) {

			if (arr1[k] <= arr2[l]) {
				ar[m] = arr1[k];
				k++;
			}
			else {
				ar[m] = arr2[l];
				l++;
			}
			m++;
		}
		//remaining arrays
		while(k<n1){
			ar[m]=arr1[k];
			m++;
			k++;
		}
		
		while(l<n2){
			ar[m]=arr2[l];
			m++;
			l++;
		}
		
	}

}
