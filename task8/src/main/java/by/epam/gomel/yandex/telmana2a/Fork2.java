package by.epam.gomel.yandex.telmana2a;

/*
Найти max{min(a, b), min(c, d)}.
 */
public class Fork2 {
    public static int findMening(int a, int b, int c, int d){
        int minAB, minCD;
        return (minAB = (a<=b) ? a : b) >= (minCD = (c<=d) ? c : d) ? minAB : minCD ;
    }

    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int d=41;

        System.out.println(Math.max(Math.min(a,b), Math.min(c,d)));

        System.out.println(findMening(7, 8, 3, 41));
    }
}
