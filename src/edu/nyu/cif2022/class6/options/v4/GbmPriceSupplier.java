package edu.nyu.cif2022.class6.options.v4;

import java.util.Random;

/**
 * A {@code PriceSupplier} based on geometric brownian motion.
 * @author eran
 *
 */
public class GbmPriceSupplier implements PriceSupplier {
	
	private final double r;
	private final double sigma;
	private final double price;
	private final Random random;
	
	/**
	 * Constructs a {@code GbmPriceSupplier} from the specified parameters.
	 * 
	 * @param r the risk free interest rate
	 * @param sigma the volatility
	 * @param price the current stock price
	 */
	public GbmPriceSupplier(double r, double sigma, double price) {
        this.r = r;
        this.sigma = sigma;
        this.price = price;
        random = new Random();
    }
	

	/**
	 * Returns a new price based on the following formula: 
	 * future_price = price * e^{(r + \sigma^2/2) + z\sigma} where z is a sample
	 * from standard normal distribution. 
	 */
	@Override
	public double price() {
		 var z = random.nextGaussian() * sigma;
		 return price * Math.exp(r + sigma * sigma / 2 + z);
	}

}
