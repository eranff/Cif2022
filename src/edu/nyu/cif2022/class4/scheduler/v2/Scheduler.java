package edu.nyu.cif2022.class4.scheduler.v2;

/**
 * A service for executing {@code Runnable}s at some specified time.
 * Scheduled tasks are executed on best effort bases at or after their specified time.
 * Tasks will be executed based on their execution time.
 */
public interface Scheduler {
	
	/**
	 * Add the specified {@code Runnable} to be executed at the specified {@code time}.
	 * 
	 * @param executionTime the time to executed the specified task in milliseconds from epoch
	 * @param task task to be executed
	 */
	void scheduleAt(long executionTime, Runnable task);
	
	/**
	 * Add the specified {@code Runnable} to be executed {@code time} millisecond from now.
	 * 
	 * @param delta the number of millisecond to wait before executing the task
	 * @param task task to be executed
	 */
	void scheduleIn(long delta, Runnable task);
}
