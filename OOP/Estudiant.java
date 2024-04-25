package OOP;

public class Estudiant {
    private String nom;
    private int edat;
    private String curs;

    public Estudiant(String estudiantNom, int estudiantEdat, String estudiantCurs) {
        nom = estudiantNom;
        edat = estudiantEdat;
        curs = estudiantCurs;
    }

    public String obtenirNom() {
        return nom;
    }

    public int obtenirEdat() {
        return edat;
    }

    public String obtenirCurs() {
        return curs;
    }
}