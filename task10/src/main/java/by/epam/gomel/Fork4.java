package by.epam.gomel;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */
public class Fork4 {
    public static void main(String[] args) {
        double sideOfHoleA = 2;
        double sideOfHoleB = 4;

        double sideOfBrickX = 2;
        double sideOfBrickY = 3;
        double sideOfBrickZ = 4;

        if((sideOfHoleA>=sideOfBrickX & sideOfHoleB>=sideOfBrickY)
                || (sideOfHoleA>=sideOfBrickY & sideOfHoleB>=sideOfBrickX)
                || (sideOfHoleA>=sideOfBrickX & sideOfHoleB>=sideOfBrickZ)
                || (sideOfHoleA>=sideOfBrickZ & sideOfHoleB>=sideOfBrickX)
                || (sideOfHoleA>=sideOfBrickZ & sideOfHoleB>=sideOfBrickY)
                || (sideOfHoleA>=sideOfBrickY & sideOfHoleB>=sideOfBrickZ)){
            System.out.println("Кирпич пролезет");
        } else {
            System.out.println("Кирпич не пролезет");
        }
    }
}
