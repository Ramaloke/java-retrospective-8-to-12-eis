package java8.streams.bestpractices;

import java8.streams.bestpractices.data.TestData;
import java8.streams.bestpractices.data.TestEntity;

import java.util.List;

import static java.util.Comparator.*;

public class StreamSortWithComparator {
    public static void main(String[] args) {
        List<TestEntity> testEntities = TestData.testEntityList();
        testEntities.add(new TestEntity(6L, "Peter", 123));
        testEntities.add(new TestEntity(7L, "Monica", 567));
        testEntities.add(new TestEntity(8L, "Jessica", 678));

        testEntities.stream()
                .sorted(
                    comparing(TestEntity::getName)
                        .thenComparing(TestEntity::getValue)
                        .thenComparing(TestEntity::getId, reverseOrder())
                )
                .forEach(System.out::println);
    }
}
