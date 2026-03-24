public class Main {
    public static void main(String[] args) {

        Biblioteka b = new Biblioteka(10);

        Ksiazka k1 = new Ksiazka("ksiazka1", "autor1", 100, true);
        Ksiazka k2 = new Ksiazka("ksiazka2", "autor2", 200, true);
        Ksiazka k3 = new Ksiazka("ksiazka3", "autor3", 150, true);

        b.dodajKsiazke(k1);
        b.dodajKsiazke(k2);
        b.dodajKsiazke(k3);

        Czytelnik c1 = new Czytelnik("imie1", "nazwisko1", "111");

        b.wypiszDostepneKsiazki();

        b.wypozyczKsiazke("ksiazka1", c1);
        b.wypozyczKsiazke("ksiazka2", c1);

        c1.wypiszDane();

        b.zwrocKsiazke("ksiazka1", c1);

        c1.wypiszDane();
    }
}