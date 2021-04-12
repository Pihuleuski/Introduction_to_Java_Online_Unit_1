package by.epam.gomel.onlinetrening;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
 */
public class Сycle5 {
    public static void main(String[] args) {
        int start = -10;
        int end = 10;
        double e = 1.0;
        double resalt = 0.0;
        double intermediateResult = 0.0;

        for (int i = start; i <=end ; i++) {
            if((intermediateResult = Math.abs((1/Math.pow(2,i))+(1/Math.pow(3,i)))) >= e){
                resalt += intermediateResult;
            }
        }
        System.out.println(resalt);
    }
}
