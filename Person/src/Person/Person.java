package Person;
/**
 * Represents a person
 * @author Ming
 */
public class Person {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object something){
        // Cast given object to Person
        Person otherPerson = (Person) something;

        // Return true if the 2 names are the same
        return this.name.equals(otherPerson.name);
    }
}
