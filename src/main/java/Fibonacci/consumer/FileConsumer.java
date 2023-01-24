package Fibonacci.consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class FileConsumer implements FibonacciConsumer {

    @Override
    public void consumerFibonacci(Collection<Integer> fibonacciCountResult) {


        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("bartek.txt"));
            for (int number : fibonacciCountResult) {
                String numberAsString = String.valueOf(number);
                writer.write(numberAsString);
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
}
