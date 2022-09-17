package edu.nyu.cif2022.class2.staticexample;

/**
 * An example for static methods.
 * 
 * <p>In this example we can observe that a static method, {@code classInfo()} has only access
 * to static fields.
 */
public class StaticMethodExample {
	
	/**
	 * Constructs ten {@code StaticMethodExample}.
	 * Invoking {@code StaticMethodExample.classInfo()} prints the number of
	 * instance created thus far as it only has access to static fields.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String...args) {
		StaticMethodExample[] classes = new StaticMethodExample[10];
		for (int i = 0; i < 10; ++i) {
			classes[i] = new StaticMethodExample();
		}
		classes[5].whoAmI();
		StaticMethodExample.classInfo();
	}
	
	private static int instanceNumber;
	private static int sum;
	private int myNumber;
	
	/**
	 * Constructs an {@code StaticMethodExample} and prints the number of instance already 
	 * constructed.
	 * Increments a sum by the number of instance created thus far.
	 */
	public StaticMethodExample() {
		System.out.println("I am class #" + instanceNumber++);
		sum += instanceNumber;
		myNumber = instanceNumber;
	}
	
	/**
	 * Prints the instance number.
	 */
	public void whoAmI() {
		System.out.println("I am instance #" + myNumber);
	}
	
	
	/**
	 * Prints the number of instances created thus far.
	 */
	public static void classInfo() {
		System.out.println("So far " + instanceNumber + " instances were constructed.");
	}
	
	/**
	 * Returns a new {@code StaticMethodExample} instance.
	 * 
	 * @return a new {@code StaticMethodExample} instance
	 */
	public static StaticMethodExample newInstance() {
		return new StaticMethodExample();
	}
}
