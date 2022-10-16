package edu.nyu.cif2022.class3.generics;

/**
 * Representation of a key-value pair where both the key and the value are {@code String}.
 */
public class KeyValueString {
	
	private String key;
	private String value;
	
	/**
	 * Constructs a {@code KeyValueString} with both the key and the value set to null.
	 */
	public KeyValueString() {
	}
	
	/**
	 * Returns the key.
	 * 
	 * @return the key
	 */
	public String key() {
		return key;
	}
	
	/**
	 * Sets the key.
	 * 
	 * @param key the key
	 */
	public void key(String key) {
		this.key = key;
	}
	
	/**
	 * Returns the value.
	 * 
	 * @return the value
	 */
	public String value() {
		return value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the value
	 */
	public void value(String value) {
		this.value = value;
	}
}
