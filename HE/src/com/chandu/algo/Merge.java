package com.chandu.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arSize = sc.nextInt();
		int[] arr = new int[arSize];
		for (int i = 0; i < arSize; i++) {
			arr[i] = sc.nextInt();
		}
		Merge ob = new Merge();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array"+Arrays.toString(arr));
		
	}
	
	public void sort(int[] ar,int first,int last){
		if(first<last){
			int middle= (last+first)/2;
			sort(ar,0,middle);
			sort(ar,middle+1,last);
			merge(ar,first,middle,last);
		}
	}
	
	public void merge(int[] ar,int first,int middle,int last){
		int sub1= middle-first+1;
		int sub2= last-middle;
		
		int[] subAr1= new int[sub1];
		int[] subAr2= new int[sub2];
		
		//copy data into temp arrays
		for(int i=0;i<sub1;++i)
			subAr1[i]=ar[first+i];
		for(int j=0;j<sub2;++j){
			
			subAr2[j]=ar[middle+1+j];
		}
		
		
		int i=0,j=0;
		int k=first;
		
		while(i<sub1&&j<sub2){
			if(subAr1[i]<=subAr2[j]){
				ar[k]=subAr1[i];
				i++;
			}else{
				ar[k]=subAr2[j];
				j++;
			}
			k++;
		}
		
		while(i< sub1){
			ar[k]=subAr1[i];
			i++;
			k++;
		}
		while(j<sub2){
			ar[k]=subAr2[j];
			j++;
			k++;
		}
		
	}
	
}
