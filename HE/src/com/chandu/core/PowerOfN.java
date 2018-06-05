package com.chandu.core;

import java.util.Scanner;

public class PowerOfN {
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int po= sc.nextInt();
		int temp=po;
		System.out.println("Enter a power");
		int n= sc.nextInt();
		for(int i=1;i<n;i++){
			po = po*temp;
		}
		System.out.println("power  "+po);
	}

}
