package edu.nyu.cif2022.homework1;

import static org.assertj.core.api.BDDAssertions.then;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

public class HomeworkOneUtilsTest {
	
	@Test
	void null_vector_returns_Double_NaN() {
		// for
		
		// when
		var result = HomeworkOneUtils.length(null);
		
		// then
		then(result).isNaN();
	}
	
	@Test
	void empty_vector_returns_Double_NaN() {
		// for
		
		// when
		var result = HomeworkOneUtils.length(new double[0]);
		
		// then
		then(result).isNaN();
	}
	
	@Test
	void length_of_minus_1_point_5_is_two_point_twenty_five() {
		// for
		var vector = new double[] {-1.5};
		
		// when
		var result = HomeworkOneUtils.length(vector);
		
		// then
		then(result).isCloseTo(2.25, Percentage.withPercentage(0.0001));
	}
	
	
	@Test
	void length_of_minus_2_and_3_is_13() {
		// for
		var vector = new double[] {-2, 3};
		
		// when
		var result = HomeworkOneUtils.length(vector);
		
		// then
		then(result).isBetween(12.99999, 13.00001);
	}

	@Test
	void length_of_Double_NaN_and_3_is_Double_NaN() {
		// for
		var vector = new double[] {Double.NaN, 3};
		
		// when
		var result = HomeworkOneUtils.length(vector);
				
		// then
		then(result).isNaN();
	}
	
	@Test
	void null_src_string_returns_zero() {
		// for
		
		// when
		var result = HomeworkOneUtils.numberOfOccurances(null, 'x');
		
		// then
		then(result).isEqualTo(0);
	}
	
	@Test
	void zero_overlap_returns_zero() {
		// for
		
		// when
		var result = HomeworkOneUtils.numberOfOccurances("asd", 'x');
		
		// then
		then(result).isEqualTo(0);
	}
	
	@Test
	void empty_string_returns_zero() {
		// for
		
		// when
		var result = HomeworkOneUtils.numberOfOccurances("", 'x');
		
		// then
		then(result).isEqualTo(0);
	}
	
	@Test
	void one_overlap_returns_one() {
		// for
		
		// when
		var result = HomeworkOneUtils.numberOfOccurances("qaxde", 'x');
		
		// then
		then(result).isEqualTo(1);
	}
	
	@Test
	void edges_overlap_returns_one() {
		// for
		
		// when
		var result = HomeworkOneUtils.numberOfOccurances("xqwerx", 'x');
		
		// then
		then(result).isEqualTo(2);
	}
}
