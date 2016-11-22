package nicramus.java8kata.lambda.samples;

import nicramus.java8kata.lambda.nicramus.java8kata.util.Utility;
import nicramus.java8kata.lambda.pojos.NameSurname;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * Created by m on 2016-11-20.
 */
public class StringUtil {
    public static List<String> transform(List<String> collection) {
        return collection.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static List<String> stringPlus(List<String> collection) {
        return collection.stream()
                .map(Utility::stringPlus)
                .collect(toList());
    }

    public static List<NameSurname> convertToSurnameName(List<NameSurname> collection) {
        return collection.stream()
                //.map(Utility::stringPlus)
                .collect(toList());
    }
}
