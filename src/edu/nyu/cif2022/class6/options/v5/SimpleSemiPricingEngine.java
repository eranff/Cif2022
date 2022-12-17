package edu.nyu.cif2022.class6.options.v5;

public class SimpleSemiPricingEngine {
	
    public static void main(String[] args) {
    	var option = new EuropeanCallOption(100);
    	var pricer = new RandomWalkPriceSupplier(0.0001, 0.1, 100);
    	var stoppingCriteria = new FixedNumberStoppingCriteria(1000);
        double profit = 0;
        boolean isDone = false;
        while (!isDone) {
        	var price = pricer.getAsDouble();
        	profit += option.apply(price);
        	isDone = stoppingCriteria.test(profit);
        } 
        System.out.println("Fair Price: " + (profit / 1000));
    }
}
