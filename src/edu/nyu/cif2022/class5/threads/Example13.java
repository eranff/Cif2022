package edu.nyu.cif2022.class5.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * A modern {@code Callable} a {@code CompletableFuture} with results.
 * 
 * @author eran
 *
 */
public class Example13 {
	
	public static void main (String...args) {
		// creating the executor service
		var executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 1000; ++i) {
			// Creating the task
			var task = new SomeCalculation();
			// Submitting the task
			var future = CompletableFuture.supplyAsync(task, executorService);
			// Subscribing a callback when the task is completed.
			future.thenAccept((result) -> System.out.println(result));
		}
		executorService.shutdown();
	}
	
	/**
	 * A {@code Supplier} of the result of some long and hard calculations
	 * @author eran
	 *
	 */
	private static class SomeCalculation implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}
		
	}


}
