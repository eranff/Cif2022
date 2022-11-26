package edu.nyu.cif2022.class5.options.v1;

import java.util.Random;

public class SimpleEuropeanCallOption {
	
	private final double r;
	private final double sigma;
	private final double price;
	private final double strike;
	private final Random random;
	
	/**
	 * Constructs a {@code SimpleEuropeanCallOption} from the specified parameters.
	 * 
	 * @param r the risk free interest rate
	 * @param sigma the volatility
	 * @param price the current stock price
	 * @param strike the option strike price
	 */
	public SimpleEuropeanCallOption(double r, double sigma, double price, double strike) {
        this.r = r;
        this.sigma = sigma;
        this.price = price;
        this.strike = strike;
        random = new Random();
    }

	/**
	 * Generates random future stock price and returns the option payout for that price.
	 * 
	 * @return an option pay out for one random trial
	 */
    public double payout() {
        var terminalPrice = price * (1 + r + random.nextGaussian() * sigma);
        return terminalPrice > strike ? terminalPrice - strike : 0;
    }

    public static void main(String[] args) {
        var simulation = new SimpleEuropeanCallOption(0.0001, 0.1, 100, 100);
        double profit = 0;
        for (int i = 0; i < 1000; ++i) {
        	profit += simulation.payout();
        }
        System.out.println("Fair Price: " + (profit / 1000));
    }
}
