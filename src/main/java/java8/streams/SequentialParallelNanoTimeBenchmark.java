package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class SequentialParallelNanoTimeBenchmark {

    private List<String> createData() {
        int count = 1_000_000;
        List<String> result = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            UUID uuid = UUID.randomUUID();
            result.add(uuid.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        SequentialParallelNanoTimeBenchmark instance = new SequentialParallelNanoTimeBenchmark();
        instance.testSequentialExecution();
        instance.testParallelExecution();
    }

    private void testSequentialExecution() {
        List<String> dataForTesting = createData();

        AtomicInteger counter = new AtomicInteger();

        long startTime = System.nanoTime();
        dataForTesting.stream().sorted().forEach(i -> counter.getAndIncrement());
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;
        System.out.println("Sequential execution finished in: " + duration + "ms");
    }

    private void testParallelExecution() {
        List<String> dataForTesting = createData();

        AtomicInteger counter = new AtomicInteger();

        long startTime = System.nanoTime();
        dataForTesting.parallelStream().sorted().forEach(i -> counter.incrementAndGet());
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;
        System.out.println("Parallel execution finished in: " + duration + "ms");
    }
}
