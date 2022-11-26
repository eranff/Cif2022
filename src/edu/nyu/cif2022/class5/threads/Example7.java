package edu.nyu.cif2022.class5.threads;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * A Demo how to use a {@code Future} to cache a result.
 * 
 * @author eran
 *
 */
public class Example7 {
	
	public static void main (String...args) throws Exception {
		List<Future<Result>> futures = new LinkedList<>();
		var executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 1000000; ++i) {
			var result = new Result();
			// Our task will populate the result object from some value
			Runnable task = () -> {
				result.value = 0;
				for (var j = 0; j < 1000000; ++j) {
					result.value += Math.random();
				}
			};
						
			// we submit the task and the result object. Not that at this point it does
			// not contain valid value.
			var future = executorService.submit(task, result);
			// adding the future to the list
			futures.add(future);
		}
		// Waiting for the tasks to be completed.
		while (!futures.isEmpty()) {
			var iterator = futures.iterator();
			while(iterator.hasNext()) {
				var future = iterator.next();
				if (future.isDone()) {
					// The future is indicated to be done, so 
					// we pull back the result object we assocaited with it 
					// and print the result.
					System.out.println(future.get().value);
					iterator.remove();
				}
			}
		}
		executorService.shutdown();
	}
	
	private static class Result {
		public double value;
	}

}
