package edu.nyu.cif2022.class4.scheduler.v1;

/**
 * A service for executing {@code ScheduledTask}.
 * Scheduled tasks are executed on best effort bases at or after their specified time.
 * Tasks will be executed based on their execution time.
 */
public interface Scheduler {
	
	/**
	 * Add the specified task to the list of task to be executed.
	 * 
	 * @param task task to add
	 */
	void schedule(ScheduledTask task);
}
