package com.chandu.starpatterns;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int value=1;
		int minRow=0;
		int minCol=0;
		int maxRow=n-1;
		int maxCol=n-1;
		int spiral[][] = new int[n][n];
		
		while(value<(n*n)){
			for(int i= minCol;i<=maxCol;i++){
				spiral[minRow][i]=value;
				value++;
			}
			//System.out.println("first "+Arrays.deepToString(spiral));
			
			for (int i = minRow+1; i <= maxRow; i++) 
            { 
                spiral[i][maxCol] = value; 
                 
                value++; 
            } 
			//System.out.println("2 "+Arrays.deepToString(spiral));
            for (int i = maxCol-1; i >= minCol; i--)
            {
                spiral[maxRow][i] = value;
                             
                value++;
            }
            //System.out.println("3 "+Arrays.deepToString(spiral));
            for (int i = maxRow-1; i >= minRow+1; i--) 
            {
                spiral[i][minCol] = value;
                 
                value++;
            }
            //System.out.println("4 "+Arrays.deepToString(spiral));
			minCol++;
            
            minRow++;
             
            maxCol--;
             
            maxRow--;
		}
		
	}

}
