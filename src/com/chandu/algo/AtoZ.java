package com.chandu.algo;

public class AtoZ {
	public static void main(String args[]){
		String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		print(input);
	}
	
	public static void print(String input){
		int count=1;
		if(input.length()>=2){
			String temp = input.substring(0,1)+input.substring(input.length()-1,input.length());
			System.out.println(temp);
			print(input.substring(count,input.length()-1));
			count++;
		}
		
	}
}
