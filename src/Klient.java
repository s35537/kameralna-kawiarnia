public class Klient {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public Klient(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public int getIdKlienta()   { return idKlienta; }
    public String getImie()     { return imie; }
    public String getNazwisko() { return nazwisko; }
    public String getEmail()    { return email; }

    @Override
    public String toString() {
        return "Klient #" + idKlienta + ": " + imie + " " + nazwisko + " <" + email + ">";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Klient)) return false;
        Klient other = (Klient) obj;
        return this.idKlienta == other.idKlienta || this.email.equals(other.email);
    }
}