package edu.nyu.cif2022.homework3.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZGPriorityQueueTest {
	
	private ZGPriorityQueue<Integer> queue;
	
	@BeforeEach
	void before_each() {
		queue = new ZGPriorityQueue<>();
	}
	
	@Test
	void add_get_one_element() {
		// for
		queue.add(123);
	}

}
