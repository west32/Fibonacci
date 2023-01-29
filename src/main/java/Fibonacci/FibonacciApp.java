package Fibonacci;

import Fibonacci.consumer.FileConsumer;
import Fibonacci.consumer.PrintConsumer;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciApp {


    public static void main(String[] args) throws IOException {

        CountFibonacci count = new CountFibonacci(null);
        System.out.println(" input 1 to save nubers to file");
        System.out.println(" input 2 to print numbers");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 1) {
            FileConsumer fileConsumer = new FileConsumer();
            count = new CountFibonacci(fileConsumer);
        } else if (option == 2) {
            PrintConsumer printConsumer = new PrintConsumer();
            count = new CountFibonacci(printConsumer);
        } else {
            System.out.println("Wrong number");
        }


        FibonacciScanner fibonaccscanner = new FibonacciScanner();
        int howManyNumbers = fibonaccscanner.getHowManyNumbers();
        count.countFibonacci(howManyNumbers);

    }
}


//todo
//