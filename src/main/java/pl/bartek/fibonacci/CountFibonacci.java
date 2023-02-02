package pl.bartek.fibonacci;

import pl.bartek.fibonacci.consumer.FibonacciConsumerStrategy;
import pl.bartek.fibonacci.consumer.FileConsumerStrategy;
import pl.bartek.fibonacci.consumer.PrintConsumerStrategy;

import java.util.ArrayList;
import java.util.List;

public class CountFibonacci {

    private final FibonacciConsumerStrategy fibonacciConsumerStrategy;

    public CountFibonacci(int consumerStrategyType) {


        if (consumerStrategyType == ConsumerStrategyType.FILE.getValue() ) {
            this.fibonacciConsumerStrategy = new FileConsumerStrategy();

        }else if (consumerStrategyType == ConsumerStrategyType.PRINT.getValue() ){
            this.fibonacciConsumerStrategy = new PrintConsumerStrategy();
        }else {
            throw new RuntimeException("not supported type");
        }
    }




    public void countFibonacci(int howManyNumbers) {

        List<Integer> fibonacciNumbers = new ArrayList<>();
        int firstNumber = 0;
        int secondNumber = 1;

        if (howManyNumbers == 0) {
            fibonacciConsumerStrategy.consumerFibonacci(fibonacciNumbers);
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

        fibonacciConsumerStrategy.consumerFibonacci(fibonacciNumbers);


    }



}





