package java9.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.*;

/**
 * Stream API improvements example: takeWhile() and dropWhile() methods.
 */
public class StreamApiImprovements {
    public static void main(String[] args) {
        //Test data
        List<Integer> testData = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Test data: " + testData);

        ArrayList<Integer> shuffledTestDate = new ArrayList<>(testData);
        Collections.shuffle(shuffledTestDate);
        System.out.println("Shuffled test data: " + shuffledTestDate);

        //limit
        List<Integer> testDataLimit = testData.stream().limit(3).collect(toList());
        System.out.println("Test data limit(3): " + testDataLimit);

        //skip
        List<Integer> testDataSkip = testData.stream().skip(5).collect(toList());
        System.out.println("Test data skip(5): " + testDataSkip);

        //limit with Predicate
        List<Integer> logicallyLimitedData = shuffledTestDate.stream().takeWhile(i -> i > 3).collect(toList());
        System.out.println("Limit while i > 3: " + logicallyLimitedData);

        //skip with Predicate
        List<Integer> logicallySkippedData = shuffledTestDate.stream().dropWhile(i -> i >5).collect(toList());
        System.out.println("Skip while i > 5: " + logicallySkippedData);
    }
}
