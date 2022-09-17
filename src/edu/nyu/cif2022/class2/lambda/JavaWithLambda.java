package edu.nyu.cif2022.class2.lambda;

import java.util.function.Function;

/**
 * An example for a Java program similar to {@code JavaWithoutLambda} that uses 
 * Lambda instead.
 * This class has the same functionality as {@code JavaWithoutLambda} without the 
 * need for a special {@code F1} class.
 * 
 * <p>The example class has one method, {@code printResultsForSeven} that accepts as a 
 * parameter a {@code Function<Long, Long>} and print the result of applying seven to
 * the function.
 */
public class JavaWithLambda {

	/**
	 * Constructs {@code JavaWithLambda} and invokes {@code printResultsForSeven} 
	 * with a Lambda which is equivalent to {@code F1} in {@code JavaWithoutLambda}.
	 * 
	 * @param args command line arguments
	 */
    public static void main(String...args) {
        JavaWithLambda example1 = new JavaWithLambda();
        example1.printResultsForSeven(x -> x * System.currentTimeMillis());
    }

    public JavaWithLambda() {}

    /**
     * Prints the result of applying seven to the specified {@code f}.
     * 
     * @param f the function
     */
    public void printResultsForSeven(Function<Long, Long> f) {
        System.out.println("The result is: " + f.apply(7L));
    }



}
