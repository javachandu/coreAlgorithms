package com.chandu.algo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int arSize= sc.nextInt();
		int[] ar=new int[arSize];
		for(int i=0;i<arSize;i++){
			ar[i]= sc.nextInt();
		}
		insertionSort(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	
	public static void insertionSort(int[] ar){
		
		for(int i=1; i<ar.length;++i){
			int key= ar[i];
			int j=i-1;
			while(j>=0&&ar[j]>key){
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
		
		
	}

}
