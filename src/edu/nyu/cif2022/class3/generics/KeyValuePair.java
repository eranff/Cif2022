package edu.nyu.cif2022.class3.generics;

/**
 * Representation of a key-value pair.
 * 
 * @param <K> the key type
 * @param <V> the value type
 */
public class KeyValuePair<K, V> {
	
	private K key;
	private V value;
	
	/**
	 * Constructs a {@code KeyValuePair} with both the key and the value set to null.
	 */
	public KeyValuePair() {
	}
	
	/**
	 * Returns the key.
	 * 
	 * @return the key
	 */
	public K key() {
		return key;
	}
	
	/**
	 * Sets the key.
	 * 
	 * @param key the key
	 */
	public void key(K key) {
		this.key = key;
	}
	
	/**
	 * Returns the value.
	 * 
	 * @return the value
	 */
	public V value() {
		return value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value the value
	 */
	public void value(V value) {
		this.value = value;
	}
}
