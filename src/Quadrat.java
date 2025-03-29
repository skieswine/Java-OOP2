public class Quadrat extends Grafik {
    private int laenge; // Quadrat Laenge

    // Konstruktor
    public Quadrat(int x, int y, int laenge, String farbe) {
        super(x, y, farbe);
        this.laenge = laenge;
    }

    // Realisirung von Methode draw()
    @Override
    public void draw() {
        System.out.println("Zeichne Quadrat an Position (" + x + ", " + y + ") mit Farbe " + farbe + " und Länge " + laenge);
    }

    // Methode um Länge zu wechseln
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    // Quadrat Eigenschaften zeigen
    public String getEigenschaften() {
        return "Position: (" + x + ", " + y + "), Farbe: " + farbe + ", Länge: " + laenge;
    }
}
