package Fibonacci.consumer;

import java.util.Collection;

public class PrintConsumer implements FibonacciConsumer {
    @Override
    public void consumerFibonacci(Collection<Integer> fibonacciCountResult) {
        System.out.println(fibonacciCountResult);
    }
}
