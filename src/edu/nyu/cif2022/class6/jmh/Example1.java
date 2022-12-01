package edu.nyu.cif2022.class6.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class Example1 {


    //@Benchmark
    public void testTmp() {
        for (int i = 0; i < 1000; ++i) {
            int c = 7 + 12;
        }
    }

    //@Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Fork(1)
    @Warmup(iterations = 20)
    @Measurement(iterations = 20)
    public void testMap() {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 100; ++i) {
            set.add(random.nextInt(10000));
        }
    }

    @State(Scope.Thread)
    public static class Test2SetUp {

        private Set<Integer> set;
        private Integer[] data;

        public Set<Integer> getSet() {
            return set;
        }

        public Integer[] getData() {
            return data;
        }

        @Setup(Level.Invocation)
        public void setup() {
            set = new HashSet<>();
            data = new Integer[100];
            Random random = new Random();
            for (int i = 0; i < 100; ++i) {
                data[i] = random.nextInt(10000);
            }
        }

    }

    //@Benchmark
    public void testMap2(Test2SetUp setUp) {
        Set<Integer> set = setUp.getSet();
        Integer[] data = setUp.getData();
        for (Integer number : data) {
            set.add(number);
        }
    }

    @Benchmark
    public void testMap3(Test2SetUp setUp) {
        Set<Integer> set = setUp.getSet();
        Integer[] data = setUp.getData();
        for (Integer number : data) {
            set.add(number);
        }
    }

}

