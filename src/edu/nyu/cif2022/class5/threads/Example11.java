package edu.nyu.cif2022.class5.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

/**
 * A demonstration of modern futures the {@code CompletableFuture}
 * 
 * @author eran
 *
 */
public class Example11 {
	
	public static void main (String...args) throws Exception {
		// Creating our thread pool.
		var executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 1000; ++i) {
			// submitting a task. Note we provide the executor service to use for the task
			// rather than submitting the task directly to the executor
			var completableFuture = CompletableFuture.runAsync(new Task(), executorService);
			final int tmp = i;
			// This is the magic. We subscribe for a callback when the task was executed!
			completableFuture.thenRun(() -> System.out.println("I am done " + tmp));
		}	
		System.out.println("DDD");
		executorService.shutdown();
	}
	
	/**
	 * A {@code Runnable} that sleep for random time.
	 * 
	 * @author eran
	 */
	public static class Task implements Runnable {
		public void run() {
			try {
				Thread.sleep((long) (100 * Math.random()));
			} catch (InterruptedException e) {}
		}
	}
}
