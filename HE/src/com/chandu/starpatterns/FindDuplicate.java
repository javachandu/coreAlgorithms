package com.chandu.starpatterns;

import java.util.Arrays;

public class FindDuplicate
{
    void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for (i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0){
            	System.out.println("iffff  "+Math.abs(arr[i])+ "elem "+arr[Math.abs(arr[i])]);
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
                System.out.println(Arrays.toString(arr));
            }
            else
                System.out.println("else "+Math.abs(arr[i]) + " ");
        }         
    } 
 
    // Driver program 
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {1, 2, 3, 1, 3, 6, 6,7};
        int arr_size = arr.length;
 
        duplicate.printRepeating(arr, arr_size);
    }
}
 
