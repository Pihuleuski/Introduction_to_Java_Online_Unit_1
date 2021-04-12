package by.epam.gomel;

/*
Вычислить значение функции:
 */
public class Fork5 {

    public static double calculateFunctionValue(double x){
        if(x<=3){
            return Math.pow(x,2)-3*x+9;
        }else{
            return 1/(Math.pow(x,3)+6);
        }
    }

    public static void main(String[] args) {
        calculateFunctionValue(3);
    }
}
