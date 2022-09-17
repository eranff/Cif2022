package edu.nyu.cif2022.homework2.solution;

import java.nio.file.Paths;
import java.util.function.Supplier;

public class Solution1 {
	
	public static void main(String...args) {
		var q1 = new Solution1();
		
		var supplier1 = new Supplier1();
		q1.printMe(supplier1);
		q1.printMe(() -> "supplier");
		
		var supplier2 = new Supplier2();
		q1.printMe(supplier2);
		q1.printMe(() -> {
			var a = Math.random();
			var b = Math.random();
			var c = a == b;
			return String.valueOf(c);
		});
		
		var supplier3 = new Supplier3();
		q1.printMe(supplier3);
		q1.printMe(() -> String.valueOf(System.nanoTime()));
		
		var supplier4 = new Supplier4();
		q1.printMe(supplier4);
		q1.printMe(() -> Paths.get("").toAbsolutePath().toString());
		
		var supplier5 = new Supplier5();
		q1.printMe(supplier5);
		q1.printMe(() -> String.valueOf(Math.random()));
		
		var supplier6 = new Supplier6();
		q1.printMe(supplier6);
		q1.printMe(() -> String.valueOf(System.currentTimeMillis()));
	}
	
	public Solution1() {
	}
	
	public void printMe(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}
	
	public static class Supplier1 implements Supplier<String> {
		@Override
		public String get() {
			return "supplier";
		}
	}
	
	public static class Supplier2 implements Supplier<String> {
		@Override
		public String get() {
			var a = Math.random();
			var b = Math.random();
			var c = a == b;
			return String.valueOf(c);
		}
	}
	
	public static class Supplier3 implements Supplier<String> {
		@Override
		public String get() {
			return String.valueOf(System.nanoTime());
		}
	}

	public static class Supplier4 implements Supplier<String> {
		@Override
		public String get() {
			return Paths.get("").toAbsolutePath().toString();
		}
	}
	
	public static class Supplier5 implements Supplier<String> {
		@Override
		public String get() {
			return String.valueOf(Math.random());
		}
	}
	
	public static class Supplier6 implements Supplier<String> {
		@Override
		public String get() {
			return String.valueOf(System.currentTimeMillis());
		}
	}
	

	
	
	
}
