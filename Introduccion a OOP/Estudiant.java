
'''
Escriu una classe que representi un estudiant amb propietats com nom, edat i curs. Afegeix un constructor 
per inicialitzar aquestes propietats i mètodes per obtenir i establir-les
'''

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