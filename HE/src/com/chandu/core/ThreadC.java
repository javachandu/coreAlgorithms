package com.chandu.core;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadC implements Callable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadC tc = new ThreadC();
		// Create a Thread Pool of size 2 (2 here is number of threads in Thread
		// pool.)
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// After creating a pool, it internally starts a Thread, so no need to
		// explicitly start a thread as we did in other approach.
		// Remember only Threads are started but what task they will execute
		// that will be passed to thread using submit() method.
		// In this approach threads will be created and started but they will
		// wait for task to be assigned to them.

		// Submit a task to Threads present in Thread pool.
		Future resultObject = executorService.submit(tc);
		// Once a task is submitted to submit method, one of the Thread from the
		// pool will pick the task and execute run method of task.
		// Wait for the result Object(resultObject) that will be returned by
		// Thread after task execution.
		String s = null;
		try {
			s = (String) resultObject.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
		System.out.println(s);
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Success";
	}

}
