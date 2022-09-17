package edu.nyu.cif2022.class2.lambda;

import java.util.List;

/**
 * Examples for Lambdas.
 */
public class SomeLambda {

    public static void main(String...args) {

    	
    	 //Will prints the word Hi via separate thread. 
    	 //The lambda replaces an instance of a {@code Runnable} class. 
        Thread t = new Thread(() -> {System.out.println("Hi");});
        t.run();

        var list = List.of(1L, 2L , 3L, 4L);
        // printing the element of a list with lambda.
        // The lambda is in lieu of a {@code Consumer}.
        list.forEach(element -> System.out.println(element));
        // Traditional way to print the elements of a list using a for loop.
        for (var element : list) {
            System.out.println(element);
        }
    }

}
