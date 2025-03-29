public abstract class Grafik {
    protected  int x;
    protected  int y;
    protected  String farbe;

    /**Konstruktor
     @param x, steht für position
     @param y, position
     @param farbe, definier Farbe
     */

    public Grafik(int x, int y, String farbe){
        this.setPosition(x,y);
        this.setFarbe(farbe);
    }

    /**Methode zum Positionirung 
     @param x 
     @param y
     */

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**Methode zum Positionirung 
     @param farbe
     */

    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Position: (" + x + ", " + y + "), Farbe: " + farbe;
    }

    //Abstracte Klasse
    public abstract void draw();
}
