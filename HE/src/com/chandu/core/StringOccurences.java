package com.chandu.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringOccurences {
	static List list = new ArrayList();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("\\s", "");
		char[] arr = input.toCharArray();
		for (char ch : arr) {
			if (!list.contains(ch)) {
				System.out.println(ch + "=" + countnum(input, ch));
				list.add(ch);
			}
		}
	}

	public static int countnum(String st, char ch) {
		list.add(ch);
		return st.length() == 0 ? 0 : (st.charAt(0) == ch ? 1 : 0) + countnum(st.substring(1), ch);
	}
}
