package edu.nyu.cif2022.class4.mockito;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;

public class Example1Test {
	
	@Test
	void constant_price_10() {
		// for
		var randomSupplier = new ConstantDataSupplier(10);
		var supplier = new Average(100, randomSupplier);
		
		// when
		var average = supplier.getAsDouble();
		
		// then
		BDDAssertions.then(average).isEqualTo(10);
	}
	
	@Test
	void constant_price_one() {
		// for
		var randomSupplier = new ConstantDataSupplier(10);
		var supplier = new Average(100, randomSupplier);
		
		// when
		var average = supplier.getAsDouble();
				
		// then
		BDDAssertions.then(average).isEqualTo(10);
	}
	
	@Test
	void linear_price() {
		// for
		var randomSupplier = new LinearIncreasingDoubleSupplier(1, 1);
		var supplier = new Average(100, randomSupplier);
		
		// when
		var average = supplier.getAsDouble();
				
		// then
		BDDAssertions.then(average).isEqualTo(50);
	}

}
