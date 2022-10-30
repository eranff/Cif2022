package edu.nyu.cif2022.class4.scheduler.v1;

/**
 * A {@code Runnable} with associated time.
 */
public interface ScheduledTask extends Runnable {
	
	/**
	 * Returns the requested execution time in milliseconds from epoch.
	 * 
	 * @return the requested execution time in milliseconds from epoch
	 */
	public long executionTime();

}
