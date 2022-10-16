package edu.nyu.cif2022.class3.scheduler;

/**
 * A {@code Runnable} with execution time.
 */
public interface ScheduledTaskv1 extends Runnable {
	
	/**
	 * Returns the time for executing the task.
	 * 
	 * @return the time for executing the task
	 */
	long executionTime();

}
