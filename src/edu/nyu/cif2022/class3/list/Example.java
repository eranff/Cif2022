package edu.nyu.cif2022.class3.list;

import java.util.LinkedList;

/**
 * Comparing the performance of two list implementations.
 * 
 * <p>This is not the appropriate way to measure performance. 
 * Such measurements should be done with JMH. 
 */
public class Example {
	
	public static void main(String...args) {
		var list = new LinkedList<String>();
		var word = "HELLO";
		var t0 = System.currentTimeMillis();
		for (var i = 0; i < 10000000; ++i) {
			for (var j = 0; j < 100; ++j) {
				list.add(word);
			}
			list.clear();
		}
		System.out.println("Jdk List total time: " + (System.currentTimeMillis() - t0));
		
		var zgList = new ZGList<String>();
		t0 = System.currentTimeMillis();
		for (var i = 0; i < 10000000; ++i) {
			for (var j = 0; j < 100; ++j) {
				zgList.add(word);
			}
			zgList.clear();
		}
		System.out.println("ZGList total time: " + (System.currentTimeMillis() - t0));
		System.out.println("Objects generated: " + SimpleNode.instanceNumber());
	}

}
