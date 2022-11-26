package edu.nyu.cif2022.class5;

public class InnerClassExample {
	
	private long x = 235;
	
	public class InnerClass {
		public void printme() {
			System.out.println("I am inner");
			System.out.println("My parent x is " + x);
		}
	}
	
	public static void main(String...args) {
		InnerClassExample outer = new InnerClassExample();
		InnerClass inner = outer.new InnerClass();
		inner.printme();
	}
}
