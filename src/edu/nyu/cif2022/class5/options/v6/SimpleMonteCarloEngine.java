package edu.nyu.cif2022.class5.options.v6;

import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleMonteCarloEngine {
	
	private final DoubleSupplier priceSupplier;
	private final Function<Double, Double> payout;
	private final Predicate<Double> isDonePredicate;
	
	public SimpleMonteCarloEngine(
			DoubleSupplier priceSupplier,
			Function<Double, Double> payout,
			Predicate<Double> isDonePredicate) {
		this.priceSupplier = priceSupplier;
		this.payout = payout;
		this.isDonePredicate = isDonePredicate;
	}
	
	public void calculate() {
		double profit = 0;
        boolean isDone = false;
        var cnt = 0;
        while (!isDone) {
        	var price = priceSupplier.getAsDouble();
        	profit += payout.apply(price);
        	isDone = isDonePredicate.test(profit);
        	++cnt;
        } 
        System.out.println("Fair Price: " + (profit / cnt));
	}

}
