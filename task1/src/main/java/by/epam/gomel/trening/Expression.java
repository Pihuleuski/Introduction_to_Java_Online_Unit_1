package by.epam.gomel.trening;

public class Expression {

    public double findExpression(Settings settings){
        return ((settings.getA() - 3) * settings.getB() / 2) + settings.getC();
    }
}
