public class MenuProdukt {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;

    public MenuProdukt(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public String getKod()       { return kod; }
    public String getNazwa()     { return nazwa; }
    public double getCena()      { return cena; }
    public String getKategoria() { return kategoria; }

    public static int getLiczbaProduktow() { return liczbaProduktow; }

    @Override
    public String toString() {
        return "[" + kategoria + "] " + nazwa + " (" + kod + ") – " + cena + " zł";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MenuProdukt)) return false;
        MenuProdukt other = (MenuProdukt) obj;
        return this.kod.equals(other.kod);
    }
}