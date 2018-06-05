package com.chandu.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {
	
	 public static void main(String[] args) {
		 
	        List<Integer> list = new ArrayList<Integer>();
	        
	        Integer[] arr = {2,10,3};
	        
	        list = Arrays.asList(arr);
	        
	        list.set(0, 3);
	        
	        //System.out.println(list);
	        
	       // list.add(1);
	        
	       // System.out.println(list);
	        size();
	    }
	 
	 
	 
	 public static void size() {
		 
	        List list = new ArrayList();
	        
	        list.add(10);
	        list.add(10);
	        
	        System.out.println("before "+list.size());
	        
	        list.remove(new Integer(10));
	        
	        System.out.println("after   "+list.size());
	    }

}
