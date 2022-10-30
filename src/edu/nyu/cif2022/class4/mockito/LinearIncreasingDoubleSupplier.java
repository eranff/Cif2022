package edu.nyu.cif2022.class4.mockito;

import java.util.function.DoubleSupplier;

public class LinearIncreasingDoubleSupplier implements DoubleSupplier {
	
	private double value;
	private double delta;
	
	public LinearIncreasingDoubleSupplier(double initialValue, double delta) {
		value = initialValue;
		this.delta = delta;
	}

	@Override
	public double getAsDouble() {
		var tmp = value;
		value += delta;
		return tmp;
	}
	
	

}
