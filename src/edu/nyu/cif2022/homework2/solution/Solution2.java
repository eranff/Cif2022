package edu.nyu.cif2022.homework2.solution;

import java.nio.file.Paths;

public class Solution2 {
	
	public static void main(String...args) {
		var s2 = new Solution2();
		
		var runnable1a = new Runnable1();
		s2.runMe(runnable1a);
		Runnable runnable1b = () -> System.out.println("runnable");
		s2.runMe(runnable1b);
		
		var runnable2a = new Runnable2();
		s2.runMe(runnable2a);
		Runnable runnable2b = () -> {
			var a = Math.random();
			var b = Math.random();
			var c = a == b;
			System.out.println(c);
		};
		s2.runMe(runnable2b);
		
		var runnable3a = new Runnable3();
		s2.runMe(runnable3a);
		Runnable runnable3b = () -> System.out.println(System.nanoTime());
		s2.runMe(runnable3b);
		
		var runnable4a = new Runnable4();
		s2.runMe(runnable4a);
		Runnable runnable4b = () -> System.out.println(Paths.get("").toAbsolutePath());
		s2.runMe(runnable4b);
		
		var runnable5a = new Runnable5();
		s2.runMe(runnable5a);
		Runnable runnable5b = () -> System.out.println(Math.random());
		s2.runMe(runnable5b);
		
		var runnable6a = new Runnable6();
		s2.runMe(runnable6a);
		Runnable runnable6b = () -> System.out.println(System.currentTimeMillis());
		s2.runMe(runnable6b);
	}
	
	public Solution2() {
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
	
	public static class Runnable2 implements Runnable {
		@Override
		public void run() {
			var a = Math.random();
			var b = Math.random();
			var c = a == b;
			System.out.println(c);
		}
	}
	
	public static class Runnable3 implements Runnable {
		@Override
		public void run() {
			System.out.println(System.nanoTime());
		}
	}

	public static class Runnable4 implements Runnable {
		@Override
		public void run() {
			System.out.println(Paths.get("").toAbsolutePath());
		}
	}
	
	public static class Runnable5 implements Runnable {
		@Override
		public void run() {
			System.out.println(Math.random());
		}
	}
	
	public static class Runnable6 implements Runnable {
		@Override
		public void run() {
			System.out.println(System.currentTimeMillis());
		}
	}
	

	
	
	
}
