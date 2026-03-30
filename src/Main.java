public class Main {
    public static void main(String[] args) {
        MenuProdukt p1 = new MenuProdukt("1", "Vanilla Late Mrożona", 18.0, "kawa");
        MenuProdukt p2 = new MenuProdukt("14", "Tartaletka", 14.5, "kawa");
        MenuProdukt p3 = new MenuProdukt("5", "Gorąca Czekolada", 16.0, "deser");

        Klient klient = new Klient(679, "Kajetan", "Moz", "s35537@schoolmail.pl");

        Zamowienie zamowienie = new Zamowienie(klient);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);
        zamowienie.dodajProdukt(p3);

        System.out.println(klient);
        System.out.println(zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc());
        System.out.println("Liczba pozycji: " + zamowienie.policzLiczbeProduktow());
        System.out.println("Liczba produktów w systemie: " + MenuProdukt.getLiczbaProduktow());

        MenuProdukt kopiaEspresso = new MenuProdukt("K-01", "Espresso duplikat", 17.5, "kawa");
        System.out.println("Czy produkty są równe? " + p1.equals(kopiaEspresso));

        zamowienie.oznaczJakoOplacone();
        System.out.println(zamowienie);
    }
}