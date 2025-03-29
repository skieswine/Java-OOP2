public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Program wird gestartet");
        //Aufgabe 1 Test

        Grafik grafik = new GrafikTest(6, 7, "black"); 
        System.out.println(grafik);

        //Aufgabe 2 Test

        // Quadrat erstellen
        Quadrat quadrat = new Quadrat(2, 3, 5, "red");
        System.out.println(quadrat.getEigenschaften());

        // draw() aufrufen
        quadrat.draw();

        // Wechslung Position und Länge
        quadrat.setPosition(4, 6);
        quadrat.setLaenge(10);
        quadrat.setFarbe("blue");

        // Resultat danach
        System.out.println(quadrat.getEigenschaften());
        quadrat.draw();

        //Aufgabe 3 Test

        RollendesQuadrat rq = new RollendesQuadrat(0, 0, 5, "green");
        System.out.println("Startposition: " + rq.rollen());

        // Geschwindigkeit wechslung
        rq.setGeschwindigkeit(3.5);
        System.out.println("Neue Geschwindigkeit: " + rq.getGeschwindigkeit());

        // Bewegung
        System.out.println("Neue Position nach Rollen: " + rq.rollen());

        //Aufgabe 5a

        Rollbar meineRolle;

        // Aufruf rollen() für Kreis
        meineRolle = new Kreis(5, 5, "Rot", 10, 5.0);
        System.out.println("Kreis rollt mit Geschwindigkeit: " + meineRolle.rollen());

        // Aufruf rollen() für Tonne
        meineRolle = new Tonne(10.0);
        System.out.println("Tonne rollt mit Geschwindigkeit: " + meineRolle.rollen());

        //Aufgabe 5b

        Comparable<String> comp1 = "Apfel";
        Comparable<String> comp2 = "Banane";

        int vergleich = comp1.compareTo((String) comp2);
        System.out.println("Vergleich von Strings: " + vergleich);

        //Aufgabe 5c
        
        Comparable<Kreis> comp3 = new Kreis(5, 5, "Blau", 10, 5.0);
        Comparable<Kreis> comp4 = new Kreis(5, 5, "Grün", 15, 7.0);

        int vergleich1 = comp3.compareTo((Kreis) comp4);
        System.out.println("Vergleich von Kreisen: " + vergleich1);
    }
}
