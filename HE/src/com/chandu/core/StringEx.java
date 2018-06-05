package com.chandu.core;

public class StringEx {
public static void main(String args[]){
	String s="chandu";
	String t=new String("chandu");
	
	System.out.println(s.equals(t));
	System.out.println(s==t);
	
	System.out.println("afterrr----");
	t=t.intern();
	System.out.println(s.equals(t));
	System.out.println(s==t);
}
}
