package edu.nyu.cif2022.homework3.solution;

/**
 * An implementation of {@code PriorityNode<E>}
 * 
 * @param <E> the element's type
 */
public class SimplePriorityNode<E extends Comparable<E>> implements PriorityNode<E> {
	
	private E element;
	private PriorityNode<E> next;
	private PriorityNode<E> previous;
	
	private static long instanceNumber;
	
	/**
	 * Constructs an empty {@code ObjectContainer}.
	 */
	public SimplePriorityNode() {
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
	public void next(PriorityNode<E> next) {
		this.next = next;
	}
	
	/**
	 * Sets the previous node in the list.
	 * 
	 * @param previous the previous node in the list.
	 */
	public void previous(PriorityNode<E> previous) {
		this.previous = previous;
	}
	
	/**
	 * Returns the next node in the list.
	 * 
	 * @return the next node in the list 
	 */
	public PriorityNode<E> next() {
		return next;
	}
	
	/**
	 * Returns the previous node in the list.
	 * 
	 * @return the previous node in the list
	 */
	public PriorityNode<E> previous() {
		return previous;
	}
	
	public void reset() {
		element = null;
		next = null;
		previous = null;
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
