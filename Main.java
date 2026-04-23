public class Main {
    public static void main(String[] args) {
        // 1 Produkty
        ProduktMenu p1 = new ProduktMenu("K01", "Espresso", 9.0, "Kawa");
        ProduktMenu p2 = new ProduktMenu("K02", "Sernik", 15.0, "Deser");
        ProduktMenu p3 = new ProduktMenu("K01", "Espresso", 9.0, "Kawa"); // Duplikat do testu equals

        // 2 Klient
        KlientKawiarni k1 = new KlientKawiarni(1, "Jan", "Kowalski", "jan@kawiarnia.pl");

        // 3 Zamówienie
        Zamowienie z1 = new Zamowienie(k1);
        z1.dodajProdukt(p1);
        z1.dodajProdukt(p2);

        // 4 Wyniki
        System.out.println("--- PODSUMOWANIE PROJEKTU ---");
        System.out.println(z1.toString());

        // 5 Test
        System.out.println("\n--- TESTY LOGICZNE ---");
        System.out.println("Czy p1 jest taki sam jak p3 (po kodzie)? " + p1.equals(p3));
        System.out.println("Liczba wszystkich stworzonych produktów: " + ProduktMenu.getLiczbaProduktow());
    }
}