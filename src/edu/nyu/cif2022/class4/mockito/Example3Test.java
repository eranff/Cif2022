package edu.nyu.cif2022.class4.mockito;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;

public class Example3Test {
	
	@Test
	void old_test() {
		// for
		var runnable = new TestRunnable();
		
		// when
		Example3.runMe(runnable);
		
		// then
		BDDAssertions.then(runnable.cnt).isOne();
	}
	
	private static class TestRunnable implements Runnable {
		
		private int cnt;
		
		private TestRunnable() {
		}
		
		public void run() {
			++cnt;
		}
	}

}
