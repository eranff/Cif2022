package edu.nyu.cif2022.class5.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class Example12 {
	
	public static void main (String...args) {
		var executorService = Executors.newFixedThreadPool(3);
		var futures = new CompletableFuture<?>[1000];
		for (int i = 0; i < 1000; ++i) {
			var task = new Example1Task(String.valueOf(i));
			var future = CompletableFuture.runAsync(task, executorService);
			futures[i] = future;
			future.thenRun(() -> System.out.println(task));
		}
		CompletableFuture<?> joinFuture = CompletableFuture.anyOf(futures);
		joinFuture.thenRun(() -> executorService.shutdown());
	}
}
