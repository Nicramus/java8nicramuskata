/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicramus.java8kata.lambda.samples;

import java.util.List;
import nicramus.java8kata.lambda.pojos.Person;
import static java.util.stream.Collectors.summingInt;

/**
 *
 * @author user
 */
public class Stats {
    private List<Person> collection;
    
    public Stats(List<Person> collection) {
        this.collection = collection;
    }
    
    public double getAverage() {
        return collection.stream()
                .mapToInt(i -> i.getAge()).average().getAsDouble();
                //.collect(summingInt(p -> p.getAge()));
        
    }
    
}
