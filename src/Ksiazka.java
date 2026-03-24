public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println(tytul + " " + autor + " " + liczbaStron + " " + dostepna);
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("wypozyczono");
        } else {
            System.out.println("brak");
        }
    }

    public void zwroc() {
        dostepna = true;
        System.out.println("zwrot");
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}
