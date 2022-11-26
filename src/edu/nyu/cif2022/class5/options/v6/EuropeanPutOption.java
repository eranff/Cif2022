package edu.nyu.cif2022.class5.options.v6;

/**
 * A representation of a European Put Option for specific strike price.
 * 
 * @author eran
 *
 */
public class EuropeanPutOption {

	private final double strike;
	
	/**
	 * Constructs a {@code EuropeanPutOption} from the specified parameters.
	 * 
	 * @param strike the option strike price
	 */
	public EuropeanPutOption(double strike) {
        this.strike = strike;
    }

	public double nicePayout(double t) {
		return t < strike ? strike - t : 0;
	}
}
