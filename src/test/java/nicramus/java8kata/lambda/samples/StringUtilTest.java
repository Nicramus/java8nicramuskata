package nicramus.java8kata.lambda.samples;

import nicramus.java8kata.lambda.pojos.NameSurname;
import org.junit.Test;

import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by m on 2016-11-19.
 */
public class StringUtilTest {
    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertEquals(expected, StringUtil.transform(collection));
    }

    @Test
    public void addToStringInList() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My1", "name1", "is1", "John1", "Doe1");
        assertEquals(expected, StringUtil.stringPlus(collection));
    }

    @Test
    public void surnameName() { //first surname, second name - test two arguemts in stream
        NameSurname mother = new NameSurname("Lisa", "Hamilton");
        NameSurname father = new NameSurname("Edward", "Norton");
        NameSurname brother = new NameSurname("Simon", "Pegg");
        List<NameSurname> collection = asList(mother, father, brother);
        List<String> expected = asList("HamiltonLisa", "NortonEdward", "PeggSimon");
        assertEquals(expected, StringUtil.convertToSurnameName(collection));
    }



}
