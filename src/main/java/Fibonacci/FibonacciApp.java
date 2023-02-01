package Fibonacci;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciApp {


    public static void main(String[] args) {


        System.out.println(" input 1 to save numbers to file");
        System.out.println(" input 2 to print numbers");
        Scanner scanner = new Scanner(System.in);
        int consumerStrategyType = scanner.nextInt();

        FibonacciScanner fibonaccscanner = new FibonacciScanner();
        int howManyNumbers = fibonaccscanner.getHowManyNumbers();
        CountFibonacci count = new CountFibonacci(consumerStrategyType);
        count.countFibonacci(howManyNumbers);

    }
}

//TODO
//1. dac mozliwosc ponownego wyboru jak wybierzez zly numer
//2. stworzyc enum dla typow naszej strategii, google it "cast int to enum"
//3. * Wizytor wzorzec (refactoring guru web) przeczytaj ze zrozumieniem, przemyslec i na next time opowiem jest podobny do strategi/i
// ale ma niewielkie roznice i wiele plusow, znalezc
// czy widze przestrzen w naszym kodzie na ten wzorzec
//4. poprawic testy i rozpisal wszystkie edge casy jakie dodac do tego co sie teraz pojawily
//rozpisac testy ktore nie musza dzialac ale napisane co bym tu stestowal itp