package by.epam.gomel.trening;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class Linear5 {
    public static void main(String[] args) {
        int secInHour = 3600;
        int secInMin = 60;

        int T = 2001;

        System.out.println(T/secInHour + "ч " + (T-(T/secInHour)*secInHour)/secInMin + "мин " + T%secInMin + "с");

    }

}
