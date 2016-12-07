/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicramus.java8kata.lambda.samples;

import java.util.Comparator;
import java.util.List;
import nicramus.java8kata.lambda.pojos.Person;

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
                .mapToInt(i -> i.getAge())
                .average()
                .getAsDouble();

                //.collect(summingInt(p -> p.getAge()));
        
    }

    public int getMax() {
        return collection.stream()
                .max(Comparator.comparing(Person::getAge)).get().getAge();

    }

    public long getCount() {
        return collection.stream().count();
    }
}
