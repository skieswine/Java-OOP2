public class GrafikTest extends Grafik {

    public GrafikTest(int x, int y, String farbe) {
        super(x, y, farbe);
    }

    @Override
    public void draw() {
        System.out.println("Zeichne Grafik an Position (" + x + ", " + y + ") mit Farbe " + farbe);
    }
}
