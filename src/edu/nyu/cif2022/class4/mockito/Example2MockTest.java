package edu.nyu.cif2022.class4.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Example2MockTest {
	
	@Test
	void test_file() throws Exception {
		// for
		var is = Mockito.mock(BufferedReader.class);
		Mockito.when(is.readLine())
		.thenReturn("10")
		.thenReturn("20")
		.thenReturn("30")
		.thenReturn("40")
		.thenReturn(null);
		
		// when
		var result = Example2.average(is);
		
		// then
		assertEquals(25, result);
	}

}
