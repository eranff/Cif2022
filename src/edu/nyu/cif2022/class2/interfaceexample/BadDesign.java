package edu.nyu.cif2022.class2.interfaceexample;

import java.util.LinkedList;
import java.util.List;

/**
 * An example of bad encapsulation.
 * 
 * <p>In this example, since we do not use the {@code Person} interface, 
 * we can mutate person objects.
 * This change happens in a method that per its name should only print the 
 * person information and not mutate it.
 */
public class BadDesign {
	
	public static void main (String...args) {
		var people = new LinkedList<MutablePerson>();
		for (int i = 0; i < 10; ++i) {
			MutablePerson person = new MutablePerson("name" + i, i);
			people.add(person);
		}
		printPerson(people);
		printPerson(people);
	}
	
	/**
	 * Prints the name of weight of each person in the list of person.
	 * 
	 * @param persons the list of person
	 */
	public static void printPerson(List<MutablePerson> persons) {
		for (var person : persons) {
			System.out.println("Name: " + person.name() + ", weight: " + person.weight());
			// This is a bug. A method should only print the name of a person should not
			// mutate its values.
			person.name("junk");
		}
	}
}
