package edu.nyu.cif2022.homework4.homework;

/**
 * A representation of an asynchronous task.
 */
public interface Async {
	
	/**
	 * Tries to cancel the execution of the corresponding task if still possible.
	 */
	public void cancel();
	
	/**
	 * Returns true if the task was already executed or cancelled successfully.
	 * 
	 * @return true if the task was already executed or cancelled successfully
	 */
	public boolean isDone();
}
