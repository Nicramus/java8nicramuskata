/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicramus.java8kata.lambda.samples;

import java.util.List;
import org.junit.Test;
import static java.util.Arrays.asList;
import org.junit.Assert;

/**
 *
 * @author user
 */
public class FlatCollectionSpecTest {
    
    
    @Test
    public void test() {
        List<List<String>> collection = asList(asList("Viktor","Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        Assert.assertEquals(expected, FlatCollectionSpec.transform(collection));
    }

}
