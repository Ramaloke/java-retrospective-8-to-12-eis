package java8.streams.bestpractices;

import java8.streams.bestpractices.data.TestData;
import java8.streams.bestpractices.data.TestEntity;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

/**
 * Extract frequently used collector expressions to separate method
 */
public class ExtractCollector {
    public static void main(String[] args) {

        //Usual way
        Map<Long, TestEntity> testEntityById = TestData.testEntityList().stream()
                .collect(toMap(TestEntity::getId, identity()));

        //Extracted collector
        Map<Long, TestEntity> myCollectorTestEntityById = TestData.testEntityList().stream()
                .collect(MyCollectors.toByIdMap());
    }

    private static class MyCollectors {
        public static Collector<TestEntity, ?, Map<Long, TestEntity>> toByIdMap() {
            return Collectors.toMap(TestEntity::getId, identity());
        }
    }
}
