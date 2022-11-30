package edu.nyu.cif2022.class5.options.v6;

public class SimpleSemiPricingEngine {
	
    public static void main(String[] args) {
    	var option = new EuropeanCallOption(100);
    	var pricer = new RandomWalkPriceSupplier(0.0001, 0.1, 100);
    	var stoppingCriteria = new FixedNumberStoppingCriteria(1000);
    	var engine = new SimpleMonteCarloEngine(
    			() -> pricer.price(), 
    			option::payout, 
    			stoppingCriteria::isDone);
    	engine.calculate();
    }
}
