package edu.nyu.cif2022.class6.options.v4;

/**
 * A predicate for deciding whether stop the monte carlo simulation.
 * 
 * @author eran
 *
 */
public interface StoppingCriteria {
	
	/**
	 * Returns true if no more simulations should be conducted.
	 * 
	 * @param payout the payout from the last experiment
	 * @return true if the simulation can stop.
	 */
	boolean isDone(double payout);
	
}
