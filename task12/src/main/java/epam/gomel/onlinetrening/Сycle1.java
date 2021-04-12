package epam.gomel.onlinetrening;
/*
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */
import java.util.Scanner;

public class Сycle1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit;
        int sum = 0;

        while (true){
            scanner.hasNext();
            if (scanner.hasNextInt()){
                if((limit = scanner.nextInt()) >= 0){
                    break;
                }
            }else{
                scanner.next();
            }
        }

        System.out.println("You entered " + limit);

        for (int i = 1; i <= limit ; i++) {
            sum += i;
        }
        System.out.println("The sum of the figures is equal to " + sum);
    }
}
