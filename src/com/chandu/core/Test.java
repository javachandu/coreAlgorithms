package com.chandu.core;

public class Test {

	public static void main(String[] args) {
		int x = 0;

		int[] nums = { 1, 2, 3, 5 };

		for (int i : nums)
			switch (i) {
			case 1:
				x += i;
			case 5:
				x += i;
			default:
				x += i;
			case 2:
				x += i;
				System.out.println(i+"  "+x);
			}
		System.out.println(x);
	}

}

class Obj {
	public static String getA(Integer value) {
		return "obj";
	}
}

class Obj1 extends Obj {
	public static String getA(Integer Val) throws ArithmeticException {
		return "obj1";
	}
}