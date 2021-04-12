package by.epam.gomel;

/*
Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */

public class Linear6 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        if(x >= 0 & y >= 0){
            if(x <= 2 & y <= 4){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else if(x > 0 & y < 0){
            if(x <= 4 & y >= -3){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else if(x < 0 & y < 0){
            if(x >= -4 & y >= -3){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else if(x < 0 & y > 0){
            if(x >= -2 & y <= 4){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }
    }
}
