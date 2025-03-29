public class Tonne implements Rollbar {
    private double geschwindigkeit;

    public Tonne(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    @Override
    public int rollen() {
        System.out.println("Tonne rollt mit Geschwindigkeit " + geschwindigkeit);
        return (int) geschwindigkeit;
    }
}
