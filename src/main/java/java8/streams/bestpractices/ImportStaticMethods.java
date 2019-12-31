package java8.streams.bestpractices;

import java8.streams.bestpractices.data.TestData;

import java.util.Map;

import static java.util.Comparator.*;
import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

/**
 * Import static stream related methods
 */
public class ImportStaticMethods {
    public static void main(String[] args) {

        //Bad code:
        /*Map<String, Integer> result = testData.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toMap(Function.identity(), String::length));*/

        //Good code:
        Map<String, Integer> result = TestData.stringListData().stream()
                .sorted(reverseOrder())
                .limit(3)
                .collect(toMap(identity(), String::length));
    }
}
