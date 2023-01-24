package Fibonacci;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    String fibonacciString;
    String fileName;

    public void whenWriteStringUsingBufferedWritter_thenCorrect()
            throws IOException {
        String fibString = fibonacciString;
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(fibString);

        writer.close();
    }

}

