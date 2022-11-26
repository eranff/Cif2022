package edu.nyu.cif2022.class5.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * A demonstration of using {@code ExecutorService} instead of spinning many threads.
 * 
 * @author eran
 *
 */
public class Example6 {
	
	public static void main (String...args) {
		// Note, I am using the name threads in purpose to show the similarities
		Map<Future<?>, Example1Task> threads = new HashMap<>();
		var executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 1000000; ++i) {
			// Creating a task
			var task = new Example1Task(String.valueOf(i));
			// submitting the task and receiving the future
			var future = executorService.submit(task);
			// Add the future/task to our5 map 
			threads.put(future, task);
		}
		// waiting for the tasks to be completed
		while (!threads.isEmpty()) {
			var iterator = threads.entrySet().iterator();
			// iterating over the live futures
			while(iterator.hasNext()) {
				var entry = iterator.next();
				if (entry.getKey().isDone()) {
					// A task was completed. Print and remove from the map
					System.out.println(entry.getValue());
					iterator.remove();
				}
			}
		}
		executorService.shutdown();
	}

}
