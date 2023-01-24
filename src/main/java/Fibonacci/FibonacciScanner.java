package Fibonacci;

import java.util.Scanner;

public class FibonacciScanner {

    public int getHowManyNumbers() {
        Scanner reader = new Scanner(System.in);
        System.out.println("how many Fibonnacci numbers you want me to generate");
        return reader.nextInt();
    }
}
