package com.chandu.he;

import java.util.Scanner;

public class RankPredector {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n, x, y;
			n = sc.nextLong();
			x = sc.nextLong();
			y = sc.nextLong();
			System.out.println(n - Math.max(x + 1, n - y) + 1);
		}

	}

}
