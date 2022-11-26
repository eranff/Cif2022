package edu.nyu.cif2022.class5.threads;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * A demonstration of {@code Callable} to avoid caching
 * @author eran
 *
 */
public class Example10 {
	
	public static void main (String...args) throws Exception {
		List<Future<Double>> futures = new LinkedList<>();
		var executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 1000; ++i) {
			// We create a callable. A task that returns a result.
			Callable<Double> task = () -> Math.random();
			// we submit the callable/task
			var future = executorService.submit(task);
			// Adding the future to the list of futures
			futures.add(future);
		}
		// iterating 
		while (!futures.isEmpty()) {
			var iterator = futures.iterator();
			while(iterator.hasNext()) {
				var future = iterator.next();
				if (future.isDone()) {
					// future is done. We can print the result which is 
					// whatever the result of the callable was
					System.out.println(future.get());
					iterator.remove();
				}
			}
		}
		executorService.shutdown();
	}
}
