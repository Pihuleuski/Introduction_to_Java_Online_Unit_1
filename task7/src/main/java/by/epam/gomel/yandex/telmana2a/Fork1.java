package by.epam.gomel.yandex.telmana2a;

/*
Даны два угла треугольника (в градусах).
Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */
public class Fork1 {
    public static void main(String[] args) {
        int a=90;
        int b=90;

        if((a+b)<180){
            System.out.println("The triangle is exist");
            if(a==90 || b==90 || a+b==90){
                System.out.println("The triangle is rectangular");
            }
        }else{
            System.out.println("The triangle isn't exist");
        }
    }
}
