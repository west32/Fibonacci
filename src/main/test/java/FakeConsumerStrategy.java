import Fibonacci.consumer.FibonacciConsumerStrategy;

import java.util.Collection;

public class FakeConsumerStrategy implements FibonacciConsumerStrategy {

    private Collection<Integer> fibonacciNumbersList;

    public Collection<Integer> getFibonacciNumbersList() {
        return fibonacciNumbersList;
    }

    public void setFibonacciNumbersList(Collection<Integer> fibonacciNumbersList) {
        this.fibonacciNumbersList = fibonacciNumbersList;
    }

    @Override

    public void consumerFibonacci(Collection<Integer> fibonacciCountResult) {
        setFibonacciNumbersList(fibonacciCountResult);
    }
}
