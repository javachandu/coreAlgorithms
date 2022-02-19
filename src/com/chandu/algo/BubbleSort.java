package com.chandu.algo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arSize = sc.nextInt();
		int[] ar = new int[arSize];
		for (int i = 0; i < arSize; i++) {
			ar[i] = sc.nextInt();
		}
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	}

	public static void bubbleSort(int[] ar) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length-i-1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
	}
}
