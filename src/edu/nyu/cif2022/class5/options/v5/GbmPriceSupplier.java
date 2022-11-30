package edu.nyu.cif2022.class5.options.v5;

import java.util.Random;
import java.util.function.DoubleSupplier;

/**
 * A {@code DoubleSupplier} for simulated stock prices 
 * based on geometric brownian motion.
 * 
 * @author eran
 */
public class GbmPriceSupplier implements DoubleSupplier {
	
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
	public double getAsDouble() {
		 var z = random.nextGaussian() * sigma;
		 return price * Math.exp(r + sigma * sigma / 2 + z);
	}

}
