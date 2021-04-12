package by.epam.gomel.yandex.telmana2a;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
import static java.lang.Math.*;

public class Fork3 {
    public static void main(String[] args) {
        double y1 = -3;
        double y2 = 0;
        double y3 = 3;
        double x1 = -3;
        double x2 = 0;
        double x3 = 3;

        double a = sqrt(pow(abs(x1-x2),2)) + sqrt(pow(abs(y1-y2),2));
        double b = sqrt(pow(abs(x2-x3),2)) + sqrt(pow(abs(y2-y3),2));
        double c = sqrt(pow(abs(x1-x3),2)) + sqrt(pow(abs(y1-y3),2));
        double p = (a+b+c)/2;
        double s = sqrt(p*(p-a)*(p-b)*(p-c));
        if(s<=0.001){
            System.out.println("Лежат на одной прямой");
        }
    }
}
