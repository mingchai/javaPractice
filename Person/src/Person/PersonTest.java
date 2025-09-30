package Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void testPerson(){
        Person person1 = new Person("Bob", 51);
        Person person2 = new Person("bob", 51);

        // Expect this to pass; uses == to compare primitive values
        assertEquals(person1.age, person2.age);
        // Uses the equals method from the Person class to determine if these 2 people are the same
        assertNotEquals(person1, person2);

        Person person3 = new Person("Bob", 24);
        // We expect this test to pass as the names are the same (case-sensitive)
        assertEquals(person1, person3);
    }
}
