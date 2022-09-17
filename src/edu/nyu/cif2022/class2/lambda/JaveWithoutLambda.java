package edu.nyu.cif2022.class2.lambda;

import java.util.function.Function;

/**
 * An example for a Java program that does not use Lambda.
 * 
 * <p>The example class has one method, {@code printResultsForSeven} that accepts as a 
 * parameter a {@code Function<Long, Long>} and print the result of applying seven to
 * the function.
 */
public class JaveWithoutLambda {

	/**
	 * Constructs {@code JavaWithoutLambda} and {@code F1} and invokes 
	 * {@code printResultsForSeven} with {@code F1} as a parameter.
	 * 
	 * @param args command line arguments
	 */
    public static void main(String...args) {
        JaveWithoutLambda example1 = new JaveWithoutLambda();
        Function<Long, Long> f = new F1();
        example1.printResultsForSeven(f);
    }


    public JaveWithoutLambda() {}

    /**
     * Prints the result of applying seven to the specified {@code f}.
     * 
     * @param f the function
     */
    public void printResultsForSeven(Function<Long, Long> f) {
        System.out.println("The result is: " + f.apply(7L));
    }

    /**
     * A {@code Function} that returns the input times the milliseconds from epoch.
     */
    private static class F1 implements Function<Long, Long> {

    	/**
    	 * {@code inheretDoc}
    	 * 
    	 * <p>Returns the specified {@ode aLong} times the millisecond from epoch.
    	 */
        @Override
        public Long apply(Long aLong) {
            return aLong * System.currentTimeMillis();
        }
    }


}
