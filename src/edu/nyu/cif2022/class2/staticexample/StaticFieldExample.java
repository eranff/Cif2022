package edu.nyu.cif2022.class2.staticexample;

/**
 * An example for static fields.
 * 
 * <p>In this example, we can see how each instance created increments the class number.
 * The class number is available as static field to every instance allowing that instance 
 * to know how many instance were already constructed.
 */
public class StaticFieldExample {
	
	/**
	 * Constructs ten {@code StaticFieldExample}.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String...args) {
		StaticFieldExample[] classes = new StaticFieldExample[10];
		for (int i = 0; i < 10; ++i) {
			classes[i] = new StaticFieldExample();
		}
		classes[0].whoAmI();
	}
	
	private static int instanceNumber;
	private int myNumber;
	
	/**
	 * Constructs an {@code StaticFieldExample} and prints the number of 
	 * instances already constructed.
	 */
	public StaticFieldExample() {
		System.out.println("I am instance #" + instanceNumber++);
		myNumber = instanceNumber;
	}
	
	/**
	 * Prints the instance number and how many instance were created thus far.
	 */
	public void whoAmI() {
		System.out.println("I am instance #" + myNumber);
		System.out.println(instanceNumber + " instances where constructed thus far.");
	}
}