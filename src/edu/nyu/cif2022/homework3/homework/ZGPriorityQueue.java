package edu.nyu.cif2022.homework3.homework;

/**
 * A zero garbage linked-list based implementation of {@code PriorityQueue} 
 *
 * @param <E> the type of element in the queue. The elements should be comparable.
 */
public class ZGPriorityQueue<E extends Comparable<E>> {
	
	private PriorityNode<E> head;
	private PriorityNode<E> tail;
	private PriorityNode<E> emptyHead;
	
	public ZGPriorityQueue() {
		
	}
	
	public void add(E element) {
		if (emptyHead == null) {
			emptyHead = new SimplePriorityNode<>();
		}
		var node = emptyHead;
		emptyHead = node.next();
		emptyHead.previous(null);	
	}
	
	public E remove() {
		return null;
	}
	
	public E peek() {
		return null;
	}
}
