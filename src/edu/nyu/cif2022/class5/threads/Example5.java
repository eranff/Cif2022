package edu.nyu.cif2022.class5.threads;

import java.util.HashMap;
import java.util.Map;

public class Example5 {
	
	public static void main (String...args) {
		Map<Thread, Example1Task> threads = new HashMap<>();
		for (int i = 0; i < 1000; ++i) {
			var task = new Example1Task(String.valueOf(i));
			var thread = new Thread(task);
			threads.put(thread, task);
			thread.start();
		}
		while (!threads.isEmpty()) {
			var iterator = threads.entrySet().iterator();
			while(iterator.hasNext()) {
				var entry = iterator.next();
				if (!entry.getKey().isAlive()) {
					System.out.println(entry.getValue());
					iterator.remove();
				}
			}
		}
	}

}
