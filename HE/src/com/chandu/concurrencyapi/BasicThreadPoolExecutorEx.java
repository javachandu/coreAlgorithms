package com.chandu.concurrencyapi;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class BasicThreadPoolExecutorEx {

	public static void main(String args[]) {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		for (int i = 0; i <= 5; i++){
			ExecutorEx task1= new ExecutorEx("Task_"+i);
			System.out.println("task Added "+task1.getName());
			executor.execute(task1);
		}
		executor.shutdown();
	}
}
