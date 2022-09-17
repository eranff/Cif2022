package edu.nyu.cif2022.class2.interfaceexample;

import java.util.LinkedList;
import java.util.List;

/**
 * An example of good encapsulation.
 * 
 * <p>In this example, since we use the {@code Person} interface, 
 * we can not mutate the person objects.
 */
public class GoodDesign {
	
	public static void main (String...args) {
		var people = new LinkedList<Person>();
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
	public static void printPerson(List<Person> persons) {
		for (var person : persons) {
			System.out.println("Name: " + person.name() + ", weight: " + person.weight());
			// Opposed to {@code BadDesign} we cannot mutate the person object here.
			//person.name("junk");
		}
	}
}
