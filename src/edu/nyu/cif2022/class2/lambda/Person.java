package edu.nyu.cif2022.class2.lambda;

/**
 * A person with name and age.
 * A {@code Person} provides a method {@code realAge} that allows find the person 
 * real age by providing an instance of a {@code PersonDetective}.
 */
public class Person {

	
    public static void main(String...args) {
        Person example3 = new Person("Nice", 7);
        // Using lambda where the real age is the name's hash code times the age.
        example3.realAge((x,y) -> (int) (x.hashCode() * y));
        // Using lambda where the real age is the age times the ASCII value of the 
        // first character of the person name.
        example3.realAge((x,y) -> (int) (x.charAt(0) * y));
    }


    private String name;
    private double age;

    /**
     * Construct a {@code Person} with the specified {@code age}
     * and {@code name}.
     * 
     * @param name a person name
     * @param age a person age
     */
    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Prints the person real age based on the specified {@code detective}.
     * 
     * @param detective the detective for finding the person real name
     */
    public void realAge(PresonDetective detective) {
        int realAge = detective.speak(name, age);
        System.out.println(realAge);
    }

}
