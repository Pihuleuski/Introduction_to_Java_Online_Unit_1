package by.epam.gomel.trening;

public class Settings {
    private double z;
    private double a;
    private double b;
    private double c;

    public Settings(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Settings() {
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
