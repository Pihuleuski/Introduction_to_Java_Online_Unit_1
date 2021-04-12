package by.epam.gomel.trening;

/*
Вычислить значение выражения по формуле
(все переменные принимают действительные значения): 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
 */

import static java.lang.Math.*;

public class Linear2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;

        System.out.println((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2));
    }

}
