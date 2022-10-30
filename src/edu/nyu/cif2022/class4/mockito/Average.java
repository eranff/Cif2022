package edu.nyu.cif2022.class4.mockito;

import java.util.function.DoubleSupplier;

/**
 * Averages n random numbers
 */
public class Average implements DoubleSupplier {
	
	private final int n;
	private final DoubleSupplier random;
	
	public Average(int n, DoubleSupplier random) {
        this.n = n;
        this.random = random;
    }
	

	@Override
	public double getAsDouble() {
		var sum = 0;
		for (var i = 0; i < n; ++i) {
			sum += random.getAsDouble();
		}
		return sum/n;
	}
}
