package edu.nyu.cif2022.homework3.solution;

import static org.assertj.core.api.BDDAssertions.then;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimplePriorityNodeTest {
	
	private SimplePriorityNode<Integer> node1;
	private SimplePriorityNode<Integer> node2;
	private SimplePriorityNode<Integer> node3;
	
	@BeforeEach
	void before_each() {
		node1 = new SimplePriorityNode<>();
		node2 = new SimplePriorityNode<>();
		node3 = new SimplePriorityNode<>();
	}
	
	@Test
	void set_get_element() {
		// for
		Integer element = 123;
		node1.element(element);
		
		// when
		var result = node1.element();
		
		// then
		then(result).isSameAs(element);
	}
	
	@Test
	void set_get_next() {
		// for
		node1.next(node2);
		
		// when
		var result = node1.next();
		
		// then
		then(result).isSameAs(node2);
	}
	
	@Test
	void set_get_previoud() {
		// for
		node1.previous(node2);
		
		// when
		var result = node1.previous();
		
		// then
		then(result).isSameAs(node2);
	}
	
	@Test
	void reset_nullify_all_objects() {
		// for
		node1.element(123);
		node1.next(node2);
		node1.previous(node3);
		
		// when
		node1.reset();
		
		// then
		then(node1.element()).isNull();
		then(node1.next()).isNull();
		then(node1.previous()).isNull();
	
	}

}
