package com.chandu.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringReplace {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] strarr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		StringBuilder sb= new StringBuilder();
		for (char c : strarr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
				char c1= (char) (map.get(c)+'0');
				sb.append(c1);
			} else {
				map.put(c, 1);
				sb.append(c);
			}
		}//end for
		
		System.out.println(sb.toString());
	}
}
