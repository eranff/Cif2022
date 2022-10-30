package edu.nyu.cif2022.class4.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.DoubleSupplier;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Example1MockTest {
	
	private DoubleSupplier randomNumberSupplier;
	private Average priceSupplier;
	
	@BeforeEach
	void before_each() {
		randomNumberSupplier = Mockito.mock(DoubleSupplier.class);
		priceSupplier = new Average(3, randomNumberSupplier);
	}
	
	@Test
	void constant_price_zero() {
		// for
		Mockito.when(randomNumberSupplier.getAsDouble()).thenReturn(10.0);
		
		// when
		var average = priceSupplier.getAsDouble();
		
		// then
		BDDAssertions.then(average).isEqualTo(10);
	}

	@Test
	void constant_price_one() {
		// for
		Mockito.when(randomNumberSupplier.getAsDouble()).thenReturn(1.0);
		
		// when
		var average = priceSupplier.getAsDouble();
		
		// then
		BDDAssertions.then(average).isEqualTo(1);
	}
	
	@Test
	void linear_price() {
		// for
		Mockito.when(randomNumberSupplier.getAsDouble())
			.thenReturn(0.0)
			.thenReturn(1.0)
			.thenReturn(2.0);
		
		// when
		var result = priceSupplier.getAsDouble();
		
		// then
		BDDAssertions.then(result).isEqualTo(1);
	}
}
