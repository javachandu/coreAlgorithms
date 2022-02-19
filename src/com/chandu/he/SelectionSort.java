package com.chandu.he;

import java.util.Arrays;
import java.util.Scanner;

/*
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element
 *  (considering ascending order) from unsorted part and putting it at the beginning.
 *   The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
 Step 1 − Set MIN to location 0
Step 2 − Search the minimum element in the list
Step 3 − Swap with value at location MIN
Step 4 − Increment MIN to point to next element
Step 5 − Repeat until list is sorted
 
 *
 */
public class SelectionSort {
	
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int arSize= sc.nextInt();
		int[] ar=new int[arSize];
		for(int i=0;i<arSize;i++){
			ar[i]= sc.nextInt();
		}
		selectionSort(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void selectionSort(int ar[]){
		
		for(int i=0;i<ar.length-1;i++){
			int minId = i;
			for(int j=(i+1);j<ar.length;j++){
				if(ar[j]<ar[minId]){
					minId=j;
				}
			}
			int temp=ar[minId];
			ar[minId]=ar[i];
			ar[i]=temp;
		}
		
	}

}
