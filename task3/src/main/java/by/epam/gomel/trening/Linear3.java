package by.epam.gomel.trening;

/*
Вычислить значение выражения по формуле
(все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦
 */

import static java.lang.Math.*;

public class Linear3 {
    public static void main(String[] args) {
        double x = 90;
        double y = 90;
        System.out.println((sin(x)+cos(y)) / (cos(x)-sin(y)) * tan(x * y));
    }
}
