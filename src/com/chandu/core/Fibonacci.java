package com.chandu.core;

public class Fibonacci {
	
	public static void main(String args[]){
		fibonacci(10);
		//System.out.println(rec(10));
	}

	
	public static void fibonacci(int n){
		int b=0;int c=1;int a=0;
		for(int i=0;i<=n;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}
	
	public static int rec(int n){
		System.out.println(n);
		if(n<=1)
			return n;
		return rec(n-2)+rec(n-1);
	}
}
