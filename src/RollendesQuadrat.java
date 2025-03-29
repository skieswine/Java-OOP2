public class RollendesQuadrat extends Grafik implements Rollbar {
    private int laenge;
    private double geschwindigkeit;

    public RollendesQuadrat(int x, int y, int laenge, String farbe) {
        super(x, y, farbe);
        this.laenge = laenge;
        this.geschwindigkeit = 1.0; // Стандартна швидкість
    }

    @Override
    public int rollen() {
        this.x += geschwindigkeit;
        return x;
    }

    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public double getGeschwindigkeit() {
        return this.geschwindigkeit;
    }

    @Override
    public void draw() {
        System.out.println("Zeichne rollendes Quadrat an Position (" + x + ", " + y + ") mit Farbe " + farbe + " und Länge " + laenge);
    }
}
