package edu.nyu.cif2022.class1;

import java.io.IOException;

/**
 * A program that copies characters from the standard input and print them to the 
 * standard output as long as they are different from the previous copied character.
 */
public class Program2 {
	
	private static int lastCharacter;
	
	public static void main(String...strings) throws IOException {
		
		while (true) {
			var input = System.in.read();
			if (input == lastCharacter || input == '\n') {
				continue;
			}
			lastCharacter = input;
			System.out.println((char) input);
		}
	}
}