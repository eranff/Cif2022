package edu.nyu.cif2022.homework3;

/**
 * A queue of elements.
 * 
 * @param<E> the type of elements in the queue
 */
public interface PriorityQueue<E extends Comparable<E>> {
	
	 /**
	  * Adds a new element to the queue.
	  *
	  * @param e the new element to add to the queue.
	  */
	 public void add(E e);
	 
	 /**
	  * Removes and returns the head of the queue.
	  *
	  * @return the head of the queue after removal.
	  */
	 public E remove();

	 /**
	  * Returns the head of the queue without removing it.
	  *
	  * @return the head of the queue without removing it
	  */ 
	 public E peek();

}
