package edu.nyu.cif2022.class4.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class Example3MockTest {
	
	@Test
	void mock_test() {
		// for
		var runnable = mock(Runnable.class);
		
		// when
		Example3.runMe(runnable);
		
		// then
		verify(runnable).run();
	}

}
