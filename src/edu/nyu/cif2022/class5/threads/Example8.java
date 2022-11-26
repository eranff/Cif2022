package edu.nyu.cif2022.class5.threads;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Demonstration of futures.
 * 
 * @author eran
 *
 */
public class Example8 {
	
	public static void main(String...args) {
		// Creating a pool of two threads for running tasks.
		var executorService = Executors.newFixedThreadPool(2);
		var futures = new ArrayList<Future<?>>();
		for (int i = 1; i < 100000; ++i) {
			var threadId = i;
			// Submitting the task to the service
			Future<?> future = executorService.submit(() -> System.out.println("Thread " + threadId));
			futures.add(future);
		}
		for (int i = 0; i < futures.size(); ++i) {
			// iterating over the futures and printing whether they are done or not.
			System.out.println("Task " + i + " " + (futures.get(i).isDone() ? "Done" : "Not Done"));
		}
		// shutting down the service.
		executorService.shutdown();
	}
}
