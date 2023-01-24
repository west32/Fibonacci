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

        FileConsumer fileConsumer = new FileConsumer();
        PrintConsumer printConsumer = new PrintConsumer();

        if (option == 1) {
            count = new CountFibonacci(fileConsumer);
        } else if (option == 2) {
            count = new CountFibonacci(printConsumer);
        } else {
            System.out.println("Wrong number");
        }


        FibonacciScanner fibonaccscanner = new FibonacciScanner();
        int howManyNumbers = fibonaccscanner.getHowManyNumbers();
        count.countFibonacci(howManyNumbers);

    }
}


//        final int filesave = 1;
//        final int print = 2;
//        int option = 0;
//        Scanner scanner = new Scanner(System.in);
//        option = scanner.nextInt();
//        switch (option) {
//            case filesave:
//                FileConsumer fileConsumer = new FileConsumer();
//                CountFibonacci count = new CountFibonacci(fileConsumer);
//                break;
//            case print:
//                PrintConsumer printConsumer = new PrintConsumer();
//                CountFibonacci count = new CountFibonacci(printConsumer);
//        }

//todo
// 1.  caly kod fibonacci przeniesc do nowego projektu javovego i zrobienie z tego repo
// 2. przeczytac stary i nowy artykul ( w nowym skupic sie na strategy)