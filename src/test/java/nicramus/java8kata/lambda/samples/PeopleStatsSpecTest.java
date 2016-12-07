package nicramus.java8kata.lambda.samples;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;
import nicramus.java8kata.lambda.pojos.Person;

import org.junit.Test;

/**
 *
 * @author user
 */
public class PeopleStatsSpecTest {
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);
    Stats stats = new Stats(collection);

    private static final double DELTA = 1e-15;

    @Test
    public void getStatsShouldReturnAverageAge() {
        double average = (4 + 40 + 42) / 3d;
        assertEquals(average, stats.getAverage(), DELTA);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertEquals(3, stats.getCount());
    }

    @Test
    public void getStatsShouldReturnMaximumRange() {
        assertEquals(42, stats.getMax());
    }





}
