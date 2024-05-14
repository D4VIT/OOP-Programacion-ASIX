import java.util.ArrayList;
import java.util.List;

class Estudiant {
    private String nom;
    private String cognom;
    private int edat;
    private List<String> matèries;

    public Estudiant(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.matèries = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }

    public List<String> getMatèries() {
        return matèries;
    }
}
