package com.chandu.core;

import java.util.ArrayList;
import java.util.List;

public class Testing implements Runnable {

	
	public static void main(String args[]){
		
		Testing test = new Testing();
		//Thread t= new Thread(test);
		//t.start();
		List list= new ArrayList();
		list.add("chandu");
		list.add(1,"myname");
		System.out.println(list);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	
}
