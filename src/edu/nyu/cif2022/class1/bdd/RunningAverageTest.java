package edu.nyu.cif2022.class1.bdd;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;

public class RunningAverageTest {
	
	@Test
	void initial_average_is_Double_NaN() {
		// for
		var calculator = new RunningAverage();
		
		// when
		var result = calculator.average();
		
		// then
		BDDAssertions.then(result).isNaN();
	}
	
	@Test
	void initial_number_of_samples_is_zero() {
		// for
		var calculator = new RunningAverage();
		
		// when
		var result = calculator.numberOfElements();
		
		// then
		BDDAssertions.then(result).isEqualTo(0);
	}
	
	@Test
	void average_of_three_is_three() {
		// for
		var calculator = new RunningAverage();
		calculator.add(3);
		
		// when
		var result = calculator.average();
		
		// then
		BDDAssertions.then(result).isEqualTo(3);
	}
	
	@Test
	void after_one_elements_number_of_elements_is_one() {
		// for
		var calculator = new RunningAverage();
		calculator.add(1);
		
		// when
		var result = calculator.numberOfElements();
		
		// then
		BDDAssertions.then(result).isEqualTo(1);
	}
	
	@Test
	void average_of_two_and_three_is_two_and_a_half() {
		// for
		var calculator = new RunningAverage();
		calculator.add(2);
		calculator.add(3);
		
		// when
		var result = calculator.average();
		
		// then
		BDDAssertions.then(result).isBetween(2.4999, 2.5000001);
	}
	
	@Test
	void after_two_elements_number_of_elements_is_two() {
		// for
		var calculator = new RunningAverage();
		calculator.add(1);
		calculator.add(3);
		
		// when
		var result = calculator.numberOfElements();
		
		// then
		BDDAssertions.then(result).isEqualTo(2);
	}
	
	@Test
	void not_BDD() {
		var calculator = new RunningAverage();
		BDDAssertions.then(calculator.average()).isNaN();
		BDDAssertions.then(calculator.numberOfElements()).isEqualTo(0);
		
		calculator.add(2);
		BDDAssertions.then(calculator.average()).isEqualTo(2);
		BDDAssertions.then(calculator.numberOfElements()).isEqualTo(1);
		
		calculator.add(3);
		BDDAssertions.then(calculator.average()).isEqualTo(2.5);
		BDDAssertions.then(calculator.numberOfElements()).isEqualTo(2);
	}
}
