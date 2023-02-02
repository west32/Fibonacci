package pl.bartek.fibonacci.consumer;

import java.util.Collection;

public interface FibonacciConsumerStrategy {

    void consumerFibonacci(Collection<Integer> fibonacciCountResult);
}
