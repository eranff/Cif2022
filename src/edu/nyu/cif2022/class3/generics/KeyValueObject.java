package edu.nyu.cif2022.class3.generics;

/**
 * Representation of a key-value pair where both the key and the value are {@code Object}.
 */
public class KeyValueObject {
	
	private Object key;
	private Object value;
	
	/**
	 * Constructs a {@code KeyValueObject} with both the key and the value set to null.
	 */
	public KeyValueObject() {
	}
	
	/**
	 * Returns the key.
	 * 
	 * @return the key
	 */
	public Object key() {
		return key;
	}
	
	/**
	 * Sets the key.
	 * 
	 * @param key the key
	 */
	public void key(Object key) {
		this.key = key;
	}
	
	/**
	 * Returns the value.
	 * 
	 * @return the value
	 */
	public Object value() {
		return value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the value
	 */
	public void value(Object value) {
		this.value = value;
	}
}
