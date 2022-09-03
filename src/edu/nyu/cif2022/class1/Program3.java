package edu.nyu.cif2022.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A class for reading lines from the standard input and echo them back to the 
 * standard output. 
 * Does not echo the same string twice.
 */
public class Program3 {
	
	private static String lastLine;
	
	public static void main(String...strings) throws IOException {
		
		// Creating a BufferedReader from the standard input stream
		var reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			// reading one line
			var input = reader.readLine();
			// if the result is null, the connection is broken, exit.   
			if (input == null) {
				break;
			}
			// if the input is identical to the previous one, wait for new input.
			if (input.equals(lastLine)) {
				continue;
			}
			lastLine = input;
			System.out.println(input);
		}
	}
}
