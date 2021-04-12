package by.epam.gomel.onlinetrening;

/*
Найти сумму квадратов первых ста чисел.
 */
public class Сycle3 {
    public static void main(String[] args) {
        int limit = 100;
        int resalt = 0;
        for (int i = 1; i <= limit; i++) {
            resalt += Math.pow(i, 2);
        }
        System.out.println(resalt);
    }
}
