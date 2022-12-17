package edu.nyu.cif2022.class6.options.v5;

import java.util.function.Function;

/**
 * A representation of a European Call Option for specific strike price.
 * 
 * @author eran
 *
 */
public class EuropeanCallOption implements Function<Double, Double> {

	private final double strike;
	
	/**
	 * Constructs a {@code EuropeanCallOption} for the specified strike.
	 * 
	 * @param strike the option strike price
	 */
	public EuropeanCallOption(double strike) {
        this.strike = strike;
    }

	/**
	 * Returns the payout for this option for the specified price.
	 */
	@Override
	public Double apply(Double t) {
		return t > strike ? t - strike : 0;
	}

}
