package edu.nyu.cif2022.class2.lambda;

/**
 * The {@code PersonDetective} provides one method that can returns 
 * the real age of a person from its name and the age he identify with.
 */
@FunctionalInterface
public interface PresonDetective {

	/**
	 * Returns a person real age based on his name and the age he provide.
	 * 
	 * @param name the person name
	 * @param age the person provided age
	 * @return the person real age
	 */
    int speak(String name, Double age);

}
