package edu.nyu.cif2022.class5.threads;

/**
 * Demonstration how to use threads with runnable. Note how we use the 
 * different method name in the {@code BusySpin} class.
 * 
 * @author eran
 */
public class Example4 {
	
	public static void main(String...args) {
		System.out.println("Start only Main");
		var duration = 10000;
		var time = System.currentTimeMillis();
		while (System.currentTimeMillis() - time < duration) {}
		System.out.println("Done only Main");
		System.out.println("Start Main + thread");
		var busySpin = new BusySpin(3 * duration);
		(new Thread(busySpin::busySpinTheCpu)).start();
		time = System.currentTimeMillis();
		while (System.currentTimeMillis() - time < duration) {}
		System.out.println("Done Main + thread");
	}
	
	/**
	 * A class that consume CPU for set amount of time.
	 * 
	 * @author eran
	 */
	private static class BusySpin {
	
		private long duration;
		
		/**
		 * Constructs {@code BusySpin} with the specified duration.
		 * 
		 * @param duration the duration of the CPU consumption.
		 */
		BusySpin(long duration) {
			this.duration = duration;
		}
		
		public void busySpinTheCpu() {
			long time = System.currentTimeMillis();
			while (System.currentTimeMillis() - time < duration) {}
		}
	}

}
