package nicramus.java8kata.lambda.samples;

import nicramus.java8kata.lambda.samples.OldestPersonSpec;
import nicramus.java8kata.lambda.pojos.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by m on 2016-11-20.
 */
public class OldestPersonSpecTest {
    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42); //expected
        List<Person> collection = asList(sara, eva, viktor);
        assertEquals(eva, OldestPersonSpec.getOldestPerson(collection));
    }
}
