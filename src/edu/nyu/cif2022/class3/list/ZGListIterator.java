package edu.nyu.cif2022.class3.list;

import java.util.Iterator;

/**
 * An iterator for {@code ZGList}.
 * The iterator behavior is undefined if the list being iterated over changes.
 */
public class ZGListIterator<E> implements Iterator<E> {
	
	private Node<E> node;
	
	/**
	 * Constructs {@code ZGListIterator} that does not iterate over an enumeration.
	 */
	public ZGListIterator() {
	}
	
	/**
	 * Sets the head of the iterator.
	 * 
	 * @param node the head of the iterator
	 */
	void set(Node<E> node) {
		this.node = node;
	}

	@Override
	public boolean hasNext() {
		return node != null;
	}

	@Override
	public E next() {
		var element = node.element();
		node = node.next();
		return element;
	}
}
