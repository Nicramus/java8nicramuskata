package nicramus.java8kata.lambda.samples;

import static java.util.Arrays.asList;
import java.util.List;
import nicramus.java8kata.lambda.pojos.Person;
import static org.junit.Assert.assertEquals;
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
   
    
    @Test
    public void getStatsShouldReturnAverageAge() {
        int average = 4 + 40 + 42 /3;
        assertEquals(average, stats.getAverage());
    }

}
