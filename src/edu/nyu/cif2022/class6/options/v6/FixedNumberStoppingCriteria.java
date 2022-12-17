package edu.nyu.cif2022.class6.options.v6;

/**
 * A stopping criteria that stops after fixed number of times.
 * @author eran
 *
 */
public class FixedNumberStoppingCriteria {
	
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
	
	public boolean isDone(double price) {
		return --cnt == 0;
	}
	
	

}
