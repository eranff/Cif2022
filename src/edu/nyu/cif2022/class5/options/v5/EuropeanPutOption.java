package edu.nyu.cif2022.class5.options.v5;

import java.util.function.Function;

/**
 * A representation of a European Put Option for specific strike price.
 * 
 * @author eran
 *
 */
public class EuropeanPutOption implements Function<Double, Double> {

	private final double strike;
	
	/**
	 * Constructs a {@code EuropeanPutOption} from the specified parameters.
	 * 
	 * @param strike the option strike price
	 */
	public EuropeanPutOption(double strike) {
        this.strike = strike;
    }

	@Override
	public Double apply(Double t) {
		return t < strike ? strike - t : 0;
	}

}
