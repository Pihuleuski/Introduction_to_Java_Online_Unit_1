package by.epam.gomel.onlinetrening;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Сycle8 {
    public static void main(String[] args) {
        int a = 12345;
        int b = 34567;

        byte [] aByte = String.valueOf(a).getBytes();
        byte [] bByte = String.valueOf(b).getBytes();

        for (byte a1 : aByte) {
            for (byte b1 : bByte) {
                if(a1 == b1){
                    System.out.println((char)a1);
                    break;
                }
            }
        }
    }
}
