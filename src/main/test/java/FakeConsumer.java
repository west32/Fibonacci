import Fibonacci.consumer.FibonacciConsumer;

import java.util.Collection;

public class FakeConsumer implements FibonacciConsumer {

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
