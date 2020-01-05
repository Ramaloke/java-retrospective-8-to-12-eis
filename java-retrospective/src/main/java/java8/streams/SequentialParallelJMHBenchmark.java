package java8.streams;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Fork(value = 1, warmups = 1)
@Warmup(iterations = 3)
@Measurement(iterations = 3)
public class SequentialParallelJMHBenchmark {

    @Param({"1000000"})
    private int COUNT;

    private List<String> dataForTesting;

    @Setup(Level.Invocation)
    public void setUp() {
        dataForTesting = createData();
    }

    private List<String> createData() {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < COUNT; ++i) {
            UUID uuid = UUID.randomUUID();
            result.add(uuid.toString());
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    public void sequentialExecution() {
        AtomicInteger counter = new AtomicInteger();
        dataForTesting.stream().sorted().forEach(i -> counter.getAndIncrement());
    }

    @Benchmark
    public void parallelExecution() {
        AtomicInteger counter = new AtomicInteger();
        dataForTesting.parallelStream().sorted().forEach(i -> counter.incrementAndGet());
    }
}
