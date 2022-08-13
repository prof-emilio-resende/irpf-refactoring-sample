package fit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import fit.domain.Person;

public class PersonTest {
    @Test
    public void shouldCreatePersonWithMinimalParameters()
    {
        // arrange
        var totalSalary = 3000.00;
        var dependents = 2;
        
        // act
        var person = new Person(totalSalary, dependents);
        
        // assert
        assertNotNull(person);
    }
}
