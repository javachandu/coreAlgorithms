package com.chandu.core;

public class ThreadDemo extends Thread{
	  
	 @Override
	 public void run() {
	   //Code present here will be executed in separate independent path.
		 System.out.println("running");
	 }
	  
	 public static void main(String[] args) {
	   
	  //Lets create Task first to assign it to the Thread
	  //ThreadDemo threadTask = new ThreadDemo();
	   
	  //Lets create a Thread and assign task to it.
	  //Way to assign task to a Thread is by passing task object(Runnable) to Thread's constructor.
	  Thread thread1 = new ThreadDemo();
	   
	  //Start a thread
	  thread1.start();
	 }
	}
