package edu.nyu.cif2022.homework2.homework;

public class Question2 {
	
	public static void main(String...args) {
		var q2 = new Question2();
		var runnable1a = new Runnable1();
		Runnable runnable1b = () -> System.out.println("runnable");
		q2.runMe(runnable1a);
		q2.runMe(runnable1b);
	}
	
	public Question2() {
	}
	
	public void runMe(Runnable runnable) {
		runnable.run();
	}
	
	public static class Runnable1 implements Runnable {
		@Override
		public void run() {
			System.out.println("runnable");
		}
	}
}
