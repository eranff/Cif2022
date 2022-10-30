package edu.nyu.cif2022.class4.mockito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;

public class Example2Test {
	
	@Test
	void test_file() throws Exception {
		// for
		var os = new PrintStream(new File("data.txt"));
		os.println(10);
		os.println(20);
		os.println(30);
		os.println(40);
		os.flush();
		os.close();
		var is = new BufferedReader(new FileReader(new File("data.txt")));
		
		// when
		var result = Example2.average(is);
		
		// then
		BDDAssertions.then(result).isEqualTo(25);
	}

}
