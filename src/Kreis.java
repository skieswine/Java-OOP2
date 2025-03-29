public class Kreis extends Grafik implements Rollbar, Comparable<Kreis> {
    private int radius;
    private double geschwindigkeit;

    public Kreis(int x, int y, String farbe, int radius, double geschwindigkeit) {
        super(x, y, farbe);
        this.radius = radius;
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Zeichne Kreis an Position (" + x + ", " + y + ") mit Radius " + radius + " und Farbe " + farbe);
    }

    @Override
    public int rollen() {
        System.out.println("Kreis rollt mit Geschwindigkeit " + geschwindigkeit);
        return (int) geschwindigkeit;
    }

    @Override
    public int compareTo(Kreis other) {
        return 0; // Dummy-Implementierung
    }

    @Override
    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
}
