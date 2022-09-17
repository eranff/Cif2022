package edu.nyu.cif2022.homework2.homework;

import java.util.function.Supplier;

public class Question1 {
	
	public static void main(String...args) {
		var q1 = new Question1();
		var supplier1 = new Supplier1();
		q1.printMe(supplier1);
		q1.printMe(() -> "supplier");
	}
	
	public Question1() {
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
}
