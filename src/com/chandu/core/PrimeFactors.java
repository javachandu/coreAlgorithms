package com.chandu.core;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int po= sc.nextInt();
		
		for(int i=2;i<(po/2);i++){
			if(po%i==0){
				System.out.println("PrimeFactor "+i);
			}
		}
		
	}
}
