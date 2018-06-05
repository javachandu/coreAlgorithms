package com.chandu.core;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strs = input.split(" ");
		palindrome(input);
		for (String s : strs)
			System.out.print(new StringBuilder(s).reverse()+" ");
	}
	
	public static void palindrome(String s){
		StringBuilder temp = new StringBuilder(s);
		if(s.equals(temp.reverse().toString()))
			System.out.println("given string is palindrome");
		else
			System.out.println("given string is not palindrome");
		
	}
}