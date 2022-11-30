package edu.nyu.cif2022.class5.options.v3;

public class SimpleSemiPricingEngine {
	
    public static void main(String[] args) {
    	var option = new EuropeanCallOption(100);
    	var pricer = new RandomWalkPriceSupplier(0.0001, 0.1, 100);
        double profit = 0;
        for (int i = 0; i < 1000; ++i) {
        	var price = pricer.price();
        	profit += option.payout(price);
        }
        System.out.println("Fair Price: " + (profit / 1000));
    }
}
