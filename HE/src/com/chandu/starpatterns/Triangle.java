package com.chandu.starpatterns;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=0;i<=n;i++){
				for(int j=0;j<=n;j++){
					if((i+j)>n)
						System.out.print(" 2");
					else
						System.out.print(" ");
				}
				System.out.println("");
			}
	}

}
