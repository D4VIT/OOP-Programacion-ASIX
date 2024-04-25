package OOP;

public class Cercle {
    public double radi;

    public Cercle(double radi) {
        radi = radi;
    }

    public double calcularArea() {
        return 3.14 * radi * radi;
    }

    public double calcularPerimetre() {
        return 2 * 3.14 * radi;
    }
}