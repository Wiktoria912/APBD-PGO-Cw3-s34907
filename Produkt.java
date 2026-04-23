public class Produkt {
    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClas() != o.get.Class()) return flase;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.cena, cena) == 0 && nazwa.equals(produkt.nazwa);
    }
    }
}