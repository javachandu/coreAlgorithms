package com.chandu.algo;

import java.util.Scanner;

public class TowersofHanoi {
	
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		towersofHanoi(n,"A","C","B");
	}
	
	public static void towersofHanoi(int n,String from,String to,String aux){
		if(n==1){
			System.out.println("Move disk 1 "+from+" to "+to );
			return;
		}
		 towersofHanoi(n-1,from,aux,to);
		 System.out.println("Move disk " + n + " from rod " +  from + " to rod " + to);
		 towersofHanoi(n-1,aux,to,from);
	}
	

}
