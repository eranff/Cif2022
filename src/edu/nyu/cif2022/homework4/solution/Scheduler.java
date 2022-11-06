package edu.nyu.cif2022.homework4.solution;

/**
 * A service for executing {@code Runnable}s at some specified time.
 * Scheduled tasks are executed on best effort bases at or after their specified time.
 * Tasks will be executed based on their execution time.
 */
public interface Scheduler {
	
	/**
	 * Add the specified {@code Runnable} to the queue of tasks to be executed at the 
	 * specified {@code time}.
	 * 
	 * @param executionTime the time to executed the specified task in milliseconds from epoch
	 * @param task task to be executed
	 */
	Async scheduleAt(long executionTime, Runnable task);
	
	/**
	 * Add the specified {@code Runnable} to the queue of tasks to be executed 
	 * {@code time} millisecond from now.
	 * 
	 * @param delta the number of millisecond to wait before executing the task
	 * @param task task to be executed
	 */
	Async scheduleIn(long delta, Runnable task);
	
	/**
	 * Add the specified {@code Runnable} to the queue of tasks to be executed 
	 * {@code time} millisecond from now and every {@code delta} milliseconds afterwards..
	 * 
	 * @param delta the number of millisecond to wait before executing the task
	 * @param task task to be executed
	 */
	Async scheduleEvery(long delta, Runnable task);
}
