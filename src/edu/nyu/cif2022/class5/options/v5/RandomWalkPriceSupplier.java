package edu.nyu.cif2022.class5.options.v5;

import java.util.Random;
import java.util.function.DoubleSupplier;

/**
 * An implementation of {@code DoubleSupplier} suppling simulated stock prices based on
 * random walk. 
 * 
 * @author eran
 *
 */
public class RandomWalkPriceSupplier implements DoubleSupplier {
	
	private final double r;
	private final double sigma;
	private final double price;
	private final Random random;
	
	/**
	 * Constructs a {@code RandomWalkPriceSupplier} from the specified parameters.
	 * 
	 * @param r the risk free interest rate
	 * @param sigma the volatility
	 * @param price the current stock price
	 */
	public RandomWalkPriceSupplier(double r, double sigma, double price) {
        this.r = r;
        this.sigma = sigma;
        this.price = price;
        random = new Random();
    }
	
	/**
	 * Returns a new price based on the following formula: 
	 * future_price = price * (1 + r + z\sigma) where z is a sample
	 * from standard normal distribution. 
	 */
	@Override
	public double getAsDouble() {
		return price * (1 + r + random.nextGaussian() * sigma);
	}

}
