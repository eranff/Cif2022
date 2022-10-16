package edu.nyu.cif2022.class3.list;

/**
 * A list that supports only adding elements and clearing the list.
 * 
 * @param <E> the element type
 */
public class BasicList<E> {
	
	private SimpleNode<E> tail;
	
	/**
	 * Constructs an empty {@code BasicList}.
	 */
	public BasicList() {
	}
	
	/**
	 * Adds an element to the list.
	 * 
	 * @param element the element to add
	 */
	public void add(E element) {
		var container = new SimpleNode<E>();
		container.element(element);
		if (tail != null) {
			tail.next(container);
			container.previous(tail);
		}
		tail = container;
	}
	
	/**
	 * Clear all the elements from the list.
	 */
	public void clear() {
		tail = null;
	}
}
