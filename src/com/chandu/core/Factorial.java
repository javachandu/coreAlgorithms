package com.chandu.core;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int r=n;
		System.out.println(fact(n));
		/*if(n==0)
			System.out.println(1);
		while(n>1){
			r=r*(n-1);
			n=(n-1);
		}
		System.out.println(r);*/
		
	}
	
	public static int fact(int n){
		if(n>=1) return n*fact(n-1);
		else
		return 1;
	}

}
