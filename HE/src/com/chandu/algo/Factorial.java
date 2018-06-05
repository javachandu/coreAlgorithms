package com.chandu.algo;

import java.util.Scanner;
/*
 * Stack level 1: fact(4) // n = 4 and is not equal to 1. So we call fact(n-1)*n

Stack level 2: fact(3)

Stack level 3: fact(2)

Stack level 4: fact(1) // now, n = 1. so we return 1 from this function.

returning values...

Stack level 3: 2 * fact(1) = 2 * 1 = 2

Stack level 2: 3 * fact(2) = 3 * 2 = 6

Stack level 1: 4 * fact(3) = 4 * 6 = 24

so we got 24.

Take note of these lines:

result = fact(n-1) * n;
           return result;
or simply:

return fact(n-1) * n;
This calls the function itself. Using 4 as an example,

In sequence according to function stacks..

return fact(3) * 4;
return fact(2) * 3 * 4
return fact(1) * 2 * 3 * 4
Substituting results...

return 1 * 2 * 3 * 4 = return 24
 */
public class Factorial {

	
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n){
		 int result;
	       if(n==0 || n==1)
	         return 1;

	       result = factorial(n-1) * n;
	       System.out.println(result);
	       return result;
	}
}
