package com.chandu.core;

public class Swapping {
	
	public static void main(String args[]){
		int a=10;
		int b=14;
		int c=25;
		int d=50;
		
		
		a=a^b;
		b=b^a;
		a=b^a;
		
		c=c+d;
		d=c-d;
		c=c-d;
		
		
		
		System.out.println(a+" "+b);
		
		System.out.println(c+" "+d);
	}

}
