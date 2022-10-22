package edu.nyu.cif2022.homework3.solution;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZGPriorityQueueTest {
	
	private ZGPriorityQueue<Integer> queue;
	
	@BeforeEach
	void before_each() {
		queue = new ZGPriorityQueue<>();
	}
	
	@Test
	void add_peek_one_element() {
		// when
		queue.add(123);
		
		// then
		then(queue.peek()).isEqualTo(123);
	}
	
	@Test
	void add_peek_remove_one_element() {
		// for
		queue.add(123);
		queue.peek();
		
		// when
		var result = queue.remove();
		
		// then
		then(result).isEqualTo(123);
	}
	
	@Test
	void add_peek_two_element_first_larger() {
		// for
		queue.add(123);
		queue.add(12);
		
		// when
		var result = queue.peek();
		
		// then
		then(result).isEqualTo(12);
	}
	
	@Test
	void add_peek_two_element_second_larger() {
		// for
		queue.add(12);
		queue.add(123);
		
		// when
		var result = queue.peek();
		
		// then
		then(result).isEqualTo(12);
	}
	
	@Test
	void add_peek_remove_two_element_first_larger() {
		// for
		queue.add(123);
		queue.add(12);
		queue.peek();
		
		// when
		var result = queue.remove();
		
		// then
		then(result).isEqualTo(12);
	}
	
	@Test
	void add_peek_remove_two_element_second_larger() {
		// for
		queue.add(12);
		queue.add(123);
		queue.peek();
		
		// when
		var result = queue.peek();
		
		// then
		then(result).isEqualTo(12);
	}
	
	
	@Test
	void add_remove_two_element_second_larger() {
		// for
		queue.add(12);
		queue.add(123);
		queue.remove();
		
		// when
		var result = queue.remove();
		
		// then
		then(result).isEqualTo(123);
	}
	
	@Test
	void four_sorted_elements_remove_third() {
		// for
		queue.add(12);
		queue.add(-1);
		queue.add(3);
		queue.add(123);
		queue.remove();
		queue.remove();
		
		// when
		var result = queue.remove();
		
		// then
		then(result).isEqualTo(12);
	}
	
	@Test
	void four_sorted_elements_remove_forth() {
		// for
		queue.add(12);
		queue.add(-1);
		queue.add(3);
		queue.add(123);
		queue.remove();
		queue.remove();
		queue.remove();
		
		// when
		var result = queue.remove();
		
		// then
		then(result).isEqualTo(123);
	}
	
	@Test
	void empty_queue_remove_returns_null() {
		// for
		queue.add(12);
		queue.remove();
		
		// when
		var result = queue.remove();
		
		// then
		then(result).isNull();
	}
	
	@Test
	void empty_queue_peek_returns_null() {
		// for
		queue.add(12);
		queue.remove();
		
		// when
		var result = queue.peek();
		
		// then
		then(result).isNull();
	}	
}
