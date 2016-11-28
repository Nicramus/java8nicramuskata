/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicramus.java8kata.lambda.samples;

import static java.util.Arrays.asList;
import java.util.List;
import nicramus.java8kata.lambda.pojos.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author user
 */
public class KidSpecTest {
    @Test
    public void getKidNameShouldReturnNamesOfAllKids() {
        Person sara = new Person("Sara", 4);
        Person tommy = new Person("Tommy", 5);
        Person edward = new Person("Edward", 55);
        Person margaret = new Person("Margaret", 66);
        
        List<Person> collection = asList(sara, tommy, edward, margaret);
        assertEquals(asList(sara,tommy),KidSpec.getList(collection));
    }
}
