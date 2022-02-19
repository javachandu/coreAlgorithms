package com.chandu.algo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleWithIndexing {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arSize = sc.nextInt();
		int[] ar = new int[arSize];
		for (int i = 0; i < arSize; i++) {
			ar[i] = sc.nextInt();
		}
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
		indexing(ar);
	}

	public static void bubbleSort(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}

	}

	public static void indexing(int[] ar) {
		int temp[] = new int[ar.length];
		int n = ar.length - 1;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				temp[count] = ar[i];
				count++;
			} else {
				temp[n] = ar[i];
				n--;
			}
		}
		System.out.println("temp " + Arrays.toString(temp));
	}

}
