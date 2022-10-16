package edu.nyu.cif2022.class3.list;

import java.util.Iterator;

/**
 * A linked list implementation supporting add and clear.
 * This list re-use node objects.
 *
 * @param <E> the element type
 */
public class ZGList<E> {
	
	private Node<E> tail;
	private Node<E> head;
	private Node<E> emptyNodeHead;
	
	/**
	 * Constructs an empty {@code ZGList}.
	 */
	public ZGList() {
	}
	
	/**
	 * Adds an element to the list.
	 * 
	 * @param element the element to add
	 */
	public void add(E element) {
		if (emptyNodeHead == null) {
			emptyNodeHead = new SimpleNode<>();
		
		}
		var node = emptyNodeHead;
		emptyNodeHead = node.next();
		node.element(element);
		if (tail == null) {
			node.next(null);
			node.previous(null);
			head = node;
		}
		if (tail != null) {
			tail.next(node);
			node.previous(tail);
			node.next(null);
		}
		tail = node;
	}
	
	/**
	 * Clear all the elements from the list.
	 */
	public void clear() {
		if (emptyNodeHead != null) {
			tail.next(emptyNodeHead);
			emptyNodeHead.previous(tail);
		}
		emptyNodeHead = head;
	}
	
	public Iterator<E> iterator() {
		var iterator = new ZGListIterator<E>();
		iterator.set(head);
		return iterator;
	}
}
