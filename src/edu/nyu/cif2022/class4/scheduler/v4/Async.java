package edu.nyu.cif2022.class4.scheduler.v4;

/**
 * A representation of an asynchronous task.
 */
public interface Async {
	
	/**
	 * Tries to cancl the execution of the corresponding task is still possible.
	 */
	public void cancel();
	
	/**
	 * Returns true if the task was already executed or cancelled successfully.
	 * 
	 * @return true if the task was already executed or cancelled successfully
	 */
	public boolean isDone();
}
