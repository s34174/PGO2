public class Czytelnik {
    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, String numerKarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0;
    }

    public void wypiszDane() {
        System.out.println(imie + " " + nazwisko + " " + liczbaWypozyczen);
    }

    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
    }

    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
        }
    }
}
