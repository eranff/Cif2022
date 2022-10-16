package edu.nyu.cif2022.class3.list;

/**
 * A node for a list list.
 * A node contains an object of some type <E> and to the previous and next nodes.
 * 
 * @param <E> the element's type
 */
public class SimpleNode<E> implements Node<E> {
	
	private E element;
	private Node<E> next;
	private Node<E> previous;
	
	private static long instanceNumber;
	
	/**
	 * Constructs an empty {@code ObjectContainer}.
	 */
	public SimpleNode() {
		++instanceNumber;
	}
	
	/**
	 * Sets the nodes's element.
	 * 
	 * @param element the node's element
	 */
	public void element(E element) {
		this.element = element;
	}
	
	/**
	 * Returns the node's element.
	 * 
	 * @return the node's element
	 */
	public E element() {
		return element;
	}
	
	/**
	 * Sets the next node in the list.
	 * 
	 * @param next the next node in the list
	 */
	public void next(Node<E> next) {
		this.next = next;
	}
	
	/**
	 * Sets the previous node in the list.
	 * 
	 * @param previous the previous node in the list.
	 */
	public void previous(Node<E> previous) {
		this.previous = previous;
	}
	
	/**
	 * Returns the next node in the list.
	 * 
	 * @return the next node in the list 
	 */
	public Node<E> next() {
		return next;
	}
	
	/**
	 * Returns the previous node in the list.
	 * 
	 * @return the previous node in the list
	 */
	public Node<E> previous() {
		return previous;
	}
	
	/**
	 * Returns the number of instances constructed thus far.
	 * 
	 * @return the number of instances constructed thus far
	 */
	static long instanceNumber() {
		return instanceNumber;
	}
}
