package edu.nyu.cif2022.class3.generics;

import java.io.File;

public class Example {
	
	public static void main(String...args) {
		var pair = new KeyValueObject();
		pair.key("abc");
		pair.value("123");
		var key = (String) pair.key();
		var value = (File) pair.value();
		
		var safePair = new KeyValuePair<String, String>();
		safePair.key("HELLO");
		safePair.value("GOOD");
		var safeKey = safePair.key();
		var safeValue = safePair.value();
	}
}
