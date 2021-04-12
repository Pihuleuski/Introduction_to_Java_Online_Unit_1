package by.epam.gomel.trening;

/*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearProgram1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        Settings settings = new Settings();

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ReaderOfNamber readerOfNamber = new ReaderOfNamber(bufferedReader);

        System.out.println("Enter a");
        settings.setA(readerOfNamber.readOfDoubleNamber());
        System.out.println("Enter b");
        settings.setB(readerOfNamber.readOfDoubleNamber());
        System.out.println("Enter c");
        settings.setC(readerOfNamber.readOfDoubleNamber());

        if(bufferedReader != null){
            bufferedReader.close();
        }

        settings.setZ(new Expression().findExpression(settings));
        System.out.println(settings.getZ());

    }

}
