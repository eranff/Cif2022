package edu.nyu.cif2022.class6.options.v4;

/**
 * A representation of a European Put Option for specific strike price.
 * 
 * @author eran
 *
 */
public class EuropeanPutOption implements OptionPayout {

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
	public double payout(double t) {
		return t < strike ? strike - t : 0;
	}
}
