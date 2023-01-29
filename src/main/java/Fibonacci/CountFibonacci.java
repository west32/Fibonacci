package Fibonacci;

import Fibonacci.consumer.FibonacciConsumer;

import java.util.ArrayList;
import java.util.List;

public class CountFibonacci {

    private final FibonacciConsumer fibonacciConsumer;

    public CountFibonacci(FibonacciConsumer fibonacciConsumer) {
        this.fibonacciConsumer = fibonacciConsumer;

    }

    public void countFibonacci(int howManyNumbers) {

        List<Integer> fibonacciNumbers = new ArrayList<>();
        int firstNumber = 0;
        int secondNumber = 1;

        if (howManyNumbers == 0) {
            fibonacciConsumer.consumerFibonacci(fibonacciNumbers);
            return;
        }
        fibonacciNumbers.add(firstNumber);
        if (howManyNumbers >= 2) {

            fibonacciNumbers.add(secondNumber);
        }
        if (howManyNumbers > 2) {
            for (int i = 2; i < howManyNumbers; i++) {
                int thirdNumber = firstNumber + secondNumber;
                fibonacciNumbers.add(thirdNumber);
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
            }
        }

        fibonacciConsumer.consumerFibonacci(fibonacciNumbers);


    }



}





