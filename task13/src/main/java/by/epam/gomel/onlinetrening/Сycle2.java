package by.epam.gomel.onlinetrening;

/*
Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Сycle2 {
    public static void main(String[] args) {
        double a =- 10;
        double b = 10;
        double h = 0.5;
        double currentPosition = a;

        while(currentPosition <= b){
            if(currentPosition > 2){
                System.out.println("x=" + currentPosition + " y=" + currentPosition);
            }else{
                System.out.println("x=" + currentPosition + " y=" + -currentPosition);
            }
            currentPosition += h;
        }
    }
}
