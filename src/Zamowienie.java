import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private Klient klient;
    private ArrayList<MenuProdukt> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public Zamowienie(Klient klient) {
        this.numerZamowienia = kolejnyNumer++;
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    public void dodajProdukt(MenuProdukt produkt) { produkty.add(produkt); }

    public double policzWartosc() {
        double suma = 0;
        for (MenuProdukt p : produkty) suma += p.getCena();
        return suma;
    }

    public int policzLiczbeProduktow() { return produkty.size(); }

    public void oznaczJakoOplacone() { this.oplacone = true; }

    public static int pobierzKolejnyNumer() { return kolejnyNumer; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Zamówienie #").append(numerZamowienia).append(" ===\n");
        sb.append("Klient: ").append(klient.getImie()).append(" ").append(klient.getNazwisko()).append("\n");
        sb.append("Produkty:\n");
        for (MenuProdukt p : produkty) sb.append("  - ").append(p).append("\n");
        sb.append("Łącznie: ").append(policzWartosc()).append(" zł\n");
        sb.append("Status: ").append(oplacone ? "OPŁACONE" : "NIEOPŁACONE");
        return sb.toString();
    }
}