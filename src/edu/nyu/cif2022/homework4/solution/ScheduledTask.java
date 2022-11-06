package edu.nyu.cif2022.homework4.solution;

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
	
	/**
	 * Returns the number of milliseconds between repeatable tasks or minus one.
	 * 
	 * @return the number of milliseconds between repeatable tasks or minus one
	 */
	public long delta();
	
	/**
	 * Returns true if the task is repeatable task.
	 * 
	 * @return true if the task is repeatable task
	 */
	public boolean isRepeatable();
	
	/**
	 * Sets the next execution time for this task.
	 * 
	 * @param executionTime the next execution time for this task.
	 */
	public void executionTime(long executionTime);
}
