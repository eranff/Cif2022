package edu.nyu.cif2022.class5.threads;

/**
 * A demonstration that threads are independent code block.
 * 
 * @author eran
 */
public class Example3 {
	
	public static void main(String...args) {
		System.out.println("Start only Main");
		var duration = 10000;
		var time = System.currentTimeMillis();
		while (System.currentTimeMillis() - time < duration) {}
		System.out.println("Done only Main");
		System.out.println("Start Main + thread");
		var thread = new BusySpin(3 * duration);
		thread.start();
		time = System.currentTimeMillis();
		while (System.currentTimeMillis() - time < duration) {}
		System.out.println("Done Main + thread");
	}
	
	/**
	 * A class that consume CPU for set amount of time.
	 * 
	 * @author eran
	 */
	private static class BusySpin extends Thread {
	
		private long duration;
		
		/**
		 * Constructs {@code BusySpin} with the specified duration.
		 * 
		 * @param duration the duration of the CPU consumption.
		 */
		BusySpin(long duration) {
			this.duration = duration;
		}
		
		public void run() {
			long time = System.currentTimeMillis();
			while (System.currentTimeMillis() - time < duration) {}
		}
	}

}
