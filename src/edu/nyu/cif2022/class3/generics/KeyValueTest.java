package edu.nyu.cif2022.class3.generics;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KeyValueTest {
	
	private KeyValuePair<String, String> keyValuePair;
	private KeyValueString keyValueString;
	
	@BeforeEach
	void before_each() {
		keyValuePair = new KeyValuePair<>();
		keyValueString = new KeyValueString();
	}
	
	@Test
	void KeyValuePair_set_get_key() {
		// for
		keyValuePair.key("NYU");
		
		// when
		var result = keyValuePair.key();
		
		// then
		then(result).isEqualTo("NYU");
	}
	
	@Test
	void KeyValueString_set_get_key() {
		// for
		keyValueString.key("NYU");
		
		// when
		var result = keyValueString.key();
		
		// then
		then(result).isEqualTo("NYU");
	}
	
	@Test
	void KeyValuePair_set_get_value() {
		// for
		keyValuePair.value("NYC");
		
		// when
		var result = keyValuePair.value();
		
		// then
		then(result).isEqualTo("NYC");
	}
	
	@Test
	void KeyValueString_set_get_value() {
		// for
		keyValueString.value("NYC");
		
		// when
		var result = keyValueString.value();
		
		// then
		then(result).isEqualTo("NYC");
	}
}
