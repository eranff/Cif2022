package edu.nyu.cif2022.class4.mockito;

import java.util.function.DoubleSupplier;

/**
 * A {@code DoubleSupplier} that returns a constant value specified on the constructor.l
 * 
 * @author eran
 */
public class ConstantDataSupplier implements DoubleSupplier {
	
	private double value;
	
	public ConstantDataSupplier(double value) {
		this.value = value;
	}

	@Override
	public double getAsDouble() {
		return value;
	}
}
