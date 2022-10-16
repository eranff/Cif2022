package edu.nyu.cif2022.class3.list;

/**
 * A node for a list list.
 * A node contains an object of some type <E> and to the previous and next nodes.
 * 
 * @param <E> the element's type
 */
public interface Node<E> {
	
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
	void next(Node<E> next);
	
	/**
	 * Sets the previous node in the list.
	 * 
	 * @param previous the previous node in the list.
	 */
	void previous(Node<E> previous);
	
	/**
	 * Returns the next node in the list.
	 * 
	 * @return the next node in the list 
	 */
	Node<E> next();
	
	/**
	 * Returns the previous node in the list.
	 * 
	 * @return the previous node in the list
	 */
	Node<E> previous();
}
