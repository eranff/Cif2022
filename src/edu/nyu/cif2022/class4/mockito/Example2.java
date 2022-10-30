package edu.nyu.cif2022.class4.mockito;

import java.io.BufferedReader;
import java.io.IOException;

public class Example2 {
	
	public static double average(BufferedReader reader) throws IOException{
		double sum = 0;
		int count = 0;
		String value;
		while ((value = reader.readLine()) != null) {
				sum += Double.valueOf(value);
				++count;
		}
		return sum / count;
	}
}
