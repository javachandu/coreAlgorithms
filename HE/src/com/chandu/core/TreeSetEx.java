package com.chandu.core;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String args[]){
		
		Set treeset= new TreeSet();
		Emp e1= new Emp(1);
		Emp e2= new Emp(1);
		
	TreeMap map= new TreeMap();
		
		
		//treeset.add(e1);
		//treeset.add(e2);
	
	map.put(1, e1);
	map.put(2, e2);
	System.out.println(map);
	}
	

}

class Emp{
	private int id=0;
	public Emp(int id){
		this.id=id;
	}
}