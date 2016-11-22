package nicramus.java8kata.lambda.samples;

import nicramus.java8kata.lambda.pojos.Person;

import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * Created by m on 2016-11-20.
 */
public class OldestPersonSpec {
    private static final Comparator<Person> comp = (p1, p2) -> Integer.compare( p1.getAge(), p2.getAge());
    public static Person getOldestPerson(List<Person> collection) {
        return collection.stream().max(comp).get();
    }
}
