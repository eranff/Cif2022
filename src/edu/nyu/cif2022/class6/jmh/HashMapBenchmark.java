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
import org.openjdk.jmh.infra.Blackhole;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class HashMapBenchmark {

    @State(Scope.Benchmark)
    public static class MapState {

        HashMap<Integer, Integer> map = new HashMap<>();

        @Setup(Level.Invocation)
        public void setup() {
            map.clear();
        }
    }

    @State(Scope.Benchmark)
    public static class EranMapState {

        HashMap<Integer, Integer> map = new HashMap<>();

        @Setup(Level.Invocation)
        public void setup() {
            map.clear();
        }
    }

    //@Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    @Fork(1)
    public Map<Integer, Integer> testAddReplaceClear(MapState state,
                                             Blackhole blackhole) {
        Map<Integer, Integer> map = state.map;
        int modulo = 63;
        for (int j = 0; j < 10_000; ++j) {
            map.put((j & modulo), (j & modulo));
        }
        return map;
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    @Fork(1)
    public HashMap<Integer, Integer> testAddReplaceClearEran(
    		MapState state, Blackhole blackhole) {

        HashMap<Integer, Integer> map = state.map;
        int modulo = 63;
        for (int j = 0; j < 10_000; ++j) {
            map.put((j & modulo), (j & modulo));
        }
        return map;
    }


}
