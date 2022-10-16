package edu.nyu.cif2022.class3.generics;

import java.io.File;

/**
 * Representation of a key-value pair where the key is an object of type {@code File} and the 
 * value is an object of type {@code String}.
 */
public class KeyValueFileString {
	
	private File key;
	private String value;
	
	/**
	 * Constructs a {@code KeyValueFileString} with both the key and the value set to null.
	 */
	public KeyValueFileString() {
	}
	
	/**
	 * Returns the key.
	 * 
	 * @return the key
	 */
	public File key() {
		return key;
	}
	
	/**
	 * Sets the key.
	 * 
	 * @param key the key
	 */
	public void key(File key) {
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
