package by.epam.gomel.onlinetrening;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
import java.util.Scanner;

public class Сycle7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mStart = 0;
        int nEnd = 0;
        int resalt;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter number " + i);

            while (true) {
                scanner.hasNext();
                if (scanner.hasNextInt()) {
                    if ((resalt = scanner.nextInt()) >= 0) {
                        break;
                    }
                } else {
                    scanner.next();
                }
            }
            if(i == 1) mStart = resalt;
            if(i == 2) nEnd = resalt;
        }
        System.out.println(mStart);
        System.out.println(nEnd);

        for (int i = mStart; i <= nEnd; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if(i%j == 0) System.out.print(j + "; ");
            }
            System.out.println();
        }
    }
}
