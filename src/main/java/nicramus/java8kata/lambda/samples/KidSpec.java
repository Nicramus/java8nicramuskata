/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicramus.java8kata.lambda.samples;

import java.util.List;
import nicramus.java8kata.lambda.pojos.Person;
import static java.util.stream.Collectors.toList;


/**
 *
 * @author user
 */
public class KidSpec {
    public static List<Person> getList(List<Person> list) {
        return list.stream().filter(a -> a.getAge() < 13).collect(toList());
    }
}
