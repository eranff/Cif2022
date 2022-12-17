package edu.nyu.cif2022.class6.options.v4;

/**
 * A representation of an option payout as a function of some price of the underlying asset.
 * 
 * @author eran
 *
 */
public interface OptionPayout {
	
	/**
	 * Returns the options payout for the specified stock price.
	 * 
	 * @param price the stock price
	 * @return the option payout
	 */
	double payout(double price);

}
