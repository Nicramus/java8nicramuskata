package nicramus.java8kata.lambda.samples;

import java.util.List;
import static java.util.stream.Collectors.summingInt;

/**
 * Created by m on 2016-11-20.
 */
public class SumSpec {
    public static int calculate(List<Integer> numbers) {
        return numbers.stream().collect(summingInt(p -> p));
    }
}
