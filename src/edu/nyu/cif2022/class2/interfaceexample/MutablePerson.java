package edu.nyu.cif2022.class2.interfaceexample;

/**
 * Mutable implementation of {@code Person}.
 */
public class MutablePerson implements Person {
	
	private String name;
	private double weight;
	
	/**
	 * Constructs a {@code MutablePerson} with the specified 
	 * {@code name} and {@code weight}.
	 * 
	 * @param name the person's name
	 * @param weight the person's weight
	 */
	public MutablePerson(String name, double weight) {	
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * Sets the this person name to the specified {@code name}.
	 * 
	 * @param name the person name.
	 */
	public void name(String name) {
		this.name = name;
	}
	
	@Override
	public String name() {
		return name;
	}

	/**
	 * Sets this person weight to the specified {@code weight}.
	 * 
	 * @param weight the person weight
	 */
	public void weight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public double weight() {
		return weight;
	}
	
}
