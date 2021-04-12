package by.epam.gomel.onlinetrening;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Сycle6 {
    public static void main(String[] args) {
        for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE ; i++) {
            if(i%10 == 0) System.out.println();
            System.out.print((char)i + " = " + i + "; ");
        }
    }
}
