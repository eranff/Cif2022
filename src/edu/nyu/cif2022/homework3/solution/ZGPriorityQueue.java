package edu.nyu.cif2022.homework3.solution;

/**
 * A zero garbage linked-list based implementation of {@code PriorityQueue} 
 *
 * @param <E> the type of element in the queue. The elements should be comparable.
 */
public class ZGPriorityQueue<E extends Comparable<E>> {
	
	private PriorityNode<E> head;
	private PriorityNode<E> emptyNodeHead;
	
	public ZGPriorityQueue() {
	}
	
	public void add(E element) {
		if (emptyNodeHead == null) {
			emptyNodeHead = new SimplePriorityNode<>();
		}
		var node = emptyNodeHead;
		emptyNodeHead = node.next();
		node.element(element);
		if (head == null) {
			// queue is empty
			head = node;
			return;
		}
		if (element.compareTo(head.element()) < 0) {
			// The element has the highest priority, it goes in front of the head.
			node.next(head);
			head = node;
			return;
		} else {
			var currentNode = head;
			var nextNode = head.next();
			while (nextNode != null) {
				if (element.compareTo(nextNode.element()) < 0) {
					currentNode.next(node);
					node.next(nextNode);
					return;
				}
				currentNode = nextNode;
				nextNode = currentNode.next();
			}
			currentNode.next(node);
		}
	}
	
	public E remove() {
		if (head != null) {
			var element = head.element();
			var tmp = head;
			head = head.next();
			tmp.reset();
			tmp.next(emptyNodeHead);
			emptyNodeHead = tmp;
			return element;
		} else {
			return null;
		}
	}
	
	public E peek() {
		if (head == null) {
			return null;
		} else {
			return head.element();
		}
	}
}
