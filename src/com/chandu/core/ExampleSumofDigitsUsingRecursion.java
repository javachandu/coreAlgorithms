package com.chandu.core;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExampleSumofDigitsUsingRecursion {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        
        System.out.println("Sum of digits of "+num + " is " + sum(num));
        Set set= new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        
        List set1= new LinkedList();
        set1.add(30);
        set1.add(10);
        set1.add(20);
        set1.add(30);
     
        System.out.println(set);
        System.out.println(set1);
        
    }
    
    public static int sum(int n){
        return n==0 ? 0 : n%10+sum(n/10);
    }
 
}
