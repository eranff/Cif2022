package edu.nyu.cif2022.homework1;

/**
 * A collection of utilities for for practicing writing tests.
 */
public final class HomeworkOneUtils {
	
	private HomeworkOneUtils() {
	}
	
	/**
	 * Returns the length of the specified {@code vector} or {@code Double.NaN} if the 
	 * specified {@code vector} is null or its length is zero.
	 * The length of the vector is the sum of its squared elements.
	 *  
	 * @param vector the vector whose is being calculated
	 * @return the length of the specified {@code vector} or {@code Double.NaN} if the 
	 *     specified {@code vector} is null or its length is zero
	 */
	public static double length(double[] vector) {
		if (vector == null || vector.length == 0) {
			return Double.NaN;
		} else {
			var length = 0d;
			for (var i = 0; i < vector.length; ++i) {
				length += vector[i] * vector[i];
			}
			return length;
		}
	}
	
	/**
	 * Returns the number of times the specified character appears in the specified string or
	 * zero if {@code src} is null.
	 * 
	 * @param src the string for counting the occurrence of the character
	 * @param character the character to compare
	 * @return the number of times the specified character appears in the specified string or
	 *     zero if {@code src} is null
	 */
	public static int numberOfOccurances(String src, char character) {
		if (src == null) {
			return 0;
		} else {
			var count = 0;
			for (var i = 0; i < src.length(); ++i) {
				if (src.charAt(i) == character) {
					++count;
				}
			}
			return count;
		}
	}
}
