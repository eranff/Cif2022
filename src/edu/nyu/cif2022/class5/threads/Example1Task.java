package edu.nyu.cif2022.class5.threads;

/**
 * A container class that is {@code Runnable}
 * @author eran
 *
 */
public class Example1Task implements Runnable {
	
	private double value;
	private String id;
	
	/**
	 * Constructs {@code Example1Task} with the specified id.
	 * 
	 * @param id the id for the task
	 */
	public Example1Task(String id) {
		this.id = id;
	}
	
	/**
	 * Assigns a random value to the task.
	 */
	public void run() {
		value = Math.random();
	}
	
	/**
	 * Returns the value associated with the task.
	 * 
	 * @return the value assocaited with the task.
	 */
	public double value() {
		return value;
	}
	
	public String toString() {
		return "Id=" + id + ", value=" + value;
	}

}
