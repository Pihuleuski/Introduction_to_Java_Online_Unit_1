package by.epam.gomel.trening;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Linear4 {
    public static void main(String[] args) {
        double x = 111.222;

        String[] parts = String.valueOf(x).split("[.]");
        x = Double.valueOf(parts[1]+"."+parts[0]);
        System.out.println(x);
    }
}
