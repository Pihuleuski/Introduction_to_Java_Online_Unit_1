package by.epam.gomel.onlinetrening;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел
 */
import java.math.BigInteger;

public class Сycle4 {
    public static void main(String[] args) {
        calculateWithTipyInt();
        calculateWithBigInteger();
    }

    public static void calculateWithBigInteger(){
        int limit = 200;
        BigInteger resalt = new BigInteger("1");
        for (int i = 1; i <= limit ; i++) {
            resalt = resalt.multiply(new BigInteger(""+i).multiply(new BigInteger(""+i)));
        }
        System.out.println(resalt);
    }

    public static void calculateWithTipyInt(){
        int limit = 200;
        int result = 1;
        int currentResalt = 0;

        for (int i = 1; i <= limit ; i++) {
            result = result * i*i;
            if(result < currentResalt){
                System.out.println("На шаге " + i + " произошло переполнение размерности типа int");
                System.out.println("Последний допустимый результат " + currentResalt);
                System.out.println("Размерность типа int " + Integer.MAX_VALUE);
                return;
            }
            currentResalt = result;
        }
    }
}
