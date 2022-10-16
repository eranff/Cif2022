package edu.nyu.cif2022.class3.generics;

import java.io.File;

/**
 * Representation of a key-value pair where both the key and the value are {@code File}.
 */
public class KeyValueFile {
	
	private File key;
	private File value;
	
	/**
	 * Constructs a {@code KeyValueFile} with both the key and the value set to null.
	 */
	public KeyValueFile() {
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
	public File value() {
		return value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the value
	 */
	public void value(File value) {
		this.value = value;
	}
}
