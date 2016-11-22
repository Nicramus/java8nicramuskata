package nicramus.java8kata.lambda.samples;

import nicramus.java8kata.lambda.samples.SumSpec;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by m on 2016-11-20.
 */
public class SumSpecTest {
    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertEquals(15, SumSpec.calculate(numbers)); //sum of all elements
    }


}
