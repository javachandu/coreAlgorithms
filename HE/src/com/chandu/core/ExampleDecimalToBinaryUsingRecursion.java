package com.chandu.core;

import java.io.IOException;
import java.util.Scanner;

public class ExampleDecimalToBinaryUsingRecursion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int num = sc.nextInt();
		decToBin(num);
	}

	public static void decToBin(int n) {
		System.out.println(n);
		if (n > 0) {
			decToBin(n / 2);
			System.out.print( n % 2);
		}
	}
}
