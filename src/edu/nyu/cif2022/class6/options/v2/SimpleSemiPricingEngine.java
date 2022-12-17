package edu.nyu.cif2022.class6.options.v2;

import java.util.Random;

public class SimpleSemiPricingEngine {
	
	private final double r;
	private final double sigma;
	private final double price;
	private final Random random;
	private final OptionPayout payoutCalculator;
	
	/**
	 * Constructs a {@code SimpleSemiPricingEngine} from the specified parameters.
	 * 
	 * @param r the risk free interest rate
	 * @param sigma the volatility
	 * @param price the current stock price
	 */
	public SimpleSemiPricingEngine(
			double r, double sigma, double price, OptionPayout payoutCalculator) {
        this.r = r;
        this.sigma = sigma;
        this.price = price;
        this.payoutCalculator = payoutCalculator;
        random = new Random();
    }

	/**
	 * Generates random future stock price and returns the option payout for that price.
	 * 
	 * @return an option pay out for one random trial
	 */
    public double payout() {
        var terminalPrice = price * (1 + r + random.nextGaussian() * sigma);
        return payoutCalculator.payout(terminalPrice);
    }

    public static void main(String[] args) {
    	OptionPayout option = new EuropeanCallOption(100);
        var simulation = new SimpleSemiPricingEngine(0.0001, 0.1, 100, option);
        double profit = 0;
        for (int i = 0; i < 1000; ++i) {
        	profit += simulation.payout();
        }
        System.out.println("Fair Price: " + (profit / 1000));
    }
}
