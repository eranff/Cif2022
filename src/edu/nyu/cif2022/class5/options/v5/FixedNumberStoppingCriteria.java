package edu.nyu.cif2022.class5.options.v5;

import java.util.function.Predicate;

/**
 * A stopping criteria that stops after fixed number of times.
 * @author eran
 *
 */
public class FixedNumberStoppingCriteria implements Predicate<Double> {
	
	private int cnt;
	
	/**
	 * Constructs a {@code FixedNumberStoppingCriteria} that stops after the 
	 * specified number of times.
	 * 
	 * @param cnt the number of experiments before stopping.
	 */
	public FixedNumberStoppingCriteria(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public boolean test(Double payout) {
		return --cnt == 0;
	}
	
	

}
