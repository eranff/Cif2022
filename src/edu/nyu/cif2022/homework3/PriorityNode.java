package edu.nyu.cif2022.homework3;

/**
 * A node for a list list containing elements that could be compared with each other.
 * 
 * @param <E> the element's type
 */
public interface PriorityNode<E extends Comparable<E>> {
	
	/**
	 * Sets the nodes's element.
	 * 
	 * @param element the node's element
	 */
	void element(E element);
	
	/**
	 * Returns the node's element.
	 * 
	 * @return the node's element
	 */
	E element();
	
	/**
	 * Sets the next node in the list.
	 * 
	 * @param next the next node in the list
	 */
	void next(PriorityNode<E> next);
	
	/**
	 * Sets the previous node in the list.
	 * 
	 * @param previous the previous node in the list.
	 */
	void previous(PriorityNode<E> previous);
	
	/**
	 * Returns the next node in the list.
	 * 
	 * @return the next node in the list 
	 */
	PriorityNode<E> next();
	
	/**
	 * Returns the previous node in the list.
	 * 
	 * @return the previous node in the list
	 */
	PriorityNode<E> previous();
}
