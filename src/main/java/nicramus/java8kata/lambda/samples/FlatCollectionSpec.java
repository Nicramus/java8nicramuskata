package nicramus.java8kata.lambda.samples;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author user
 */
public class FlatCollectionSpec {
    public static List<String> transform (List<List<String>> list) {
        return list.stream().flatMap(val -> val.stream()).collect(toList());
    }
}
