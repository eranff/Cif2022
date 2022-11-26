package edu.nyu.cif2022.class5.threads;

/**
 * A demonstration that a thread works independently and receives independent CPU
 * slice.
 * 
 * @author eran
 *
 */
public class Example1 {
	
	public static void main(String...args) {
		System.out.println("Start only Main");
		var example = new ThreadEx();
		example.start();
	}
	
	private static class ThreadEx extends Thread {
	
		public void run() {
			System.out.println("example");
		}
	}

}
