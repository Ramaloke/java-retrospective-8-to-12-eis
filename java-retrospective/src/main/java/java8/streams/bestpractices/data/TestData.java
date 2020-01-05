package java8.streams.bestpractices.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestData {
    public static List<String> stringListData() {
        return Arrays.asList("Peter", "Monica", "Jessica", "John", "Valdemar");
    }

    public static List<TestEntity> testEntityList() {
        return new ArrayList<>(List.of(
                new TestEntity(1L, "Peter", 123),
                new TestEntity(2L, "Monica", 456),
                new TestEntity(3L, "Jessica", 789),
                new TestEntity(4L, "John", 012),
                new TestEntity(5L, "Valdemar", 345)
        ));
    }
}
