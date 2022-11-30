package edu.nyu.cif2022.class5.options.v3;

/**
 * A representation of a European Call Option for specific strike price.
 * 
 * @author eran
 *
 */
public class EuropeanCallOption implements OptionPayout {

	private final double strike;
	
	/**
	 * Constructs a {@code EuropeanCallOption} for the specified strike.
	 * 
	 * @param strike the option strike price
	 */
	public EuropeanCallOption(double strike) {
        this.strike = strike;
    }

	@Override
	public double payout(double t) {
		return t > strike ? t - strike : 0;
	}

}
