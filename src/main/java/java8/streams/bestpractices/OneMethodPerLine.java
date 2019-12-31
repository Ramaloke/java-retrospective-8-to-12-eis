package java8.streams.bestpractices;

import java8.streams.bestpractices.data.TestData;

/**
 * One stream method per line
 */
public class OneMethodPerLine {

    public static void main(String[] args) {

        //Bad code:
        TestData.stringListData().stream().filter(s -> s.length() > 4).sorted().map(s -> s.substring(0, 4)).forEach(System.out::println);

        //Good code:
        TestData.stringListData().stream()
                .filter(s -> s.length() > 4)
                .sorted()
                .map(s -> s.substring(0, 4))
                .forEach(System.out::println);
    }
}
