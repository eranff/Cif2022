package edu.nyu.cif2022.class5.threads;

public class Example0 {
	
	public static void main(String...args) {
		System.out.println("Main thread " + Thread.currentThread().getId());
		var thread = new Thread(() -> {
			System.out.println("I am in a thread " + Thread.currentThread().getId());});
		thread.start();
		System.out.println("Main thread " + Thread.currentThread().getId());
	}

}
