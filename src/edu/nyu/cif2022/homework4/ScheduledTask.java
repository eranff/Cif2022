package edu.nyu.cif2022.homework4;

/**
 * A {@code Runnable} with execution time for execution.
 * This scheduled task can be compared with other scheduled tasks.
 */
public interface ScheduledTask extends Runnable, Comparable<ScheduledTask> {
	
	/**
	 * Returns the time for executing the task.
	 * 
	 * @return the time for executing the task
	 */
	long executionTime();
}
