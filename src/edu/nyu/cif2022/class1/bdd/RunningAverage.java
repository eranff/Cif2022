package edu.nyu.cif2022.class1.bdd;

/**
 * A running average calculator.
 */
public final class RunningAverage {

	private int cnt;
	private double average;
	
	public RunningAverage() {
	}
	
	/**
	 * Adds a new value for the list of values being averaged.
	 * 
	 * @param value the new value to add to the list of value
	 */
	public void add(double value) {
		++cnt;
		average = average / cnt * (cnt - 1) + value / cnt;
	}
	
	/**
	 * Returns the average of all the values added or {@code Double.NaN} if no value was added yet.
	 * 
	 * @return the average of all the values added or {@code Double.NaN} if no value was added yet
	 */
	public double average() {
		return cnt == 0 ? Double.NaN : average; 
	}
	
	/**
	 * Returns the number of elements added thus far to the list of values.
	 * 
	 * @return the number of elements added thus far to the list of values
	 */
	public int numberOfElements() {
		return cnt;
	}
}
