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

    public void afegirMatèria(String matèria) {
        matèries.add(matèria);
    }

    public void eliminarMatèria(String matèria) {
        matèries.remove(matèria);
    }
}

public class GestorEstudiants {
    private static List<Estudiant> estudiants;

    public static void main(String[] args) {
        estudiants = new ArrayList<>();
        boolean sortir = false;

        while (!sortir) {
            mostrarMenu();
            int opcio = obtenerOpcion();

            if (opcio == 1) {
                afegirEstudiant();
            } else if (opcio == 2) {
                afegirMateriaEstudiant();
            } else if (opcio == 3) {
                eliminarMateriaEstudiant();
            } else if (opcio == 4) {
                mostrarEstudiants();
            } else if (opcio == 5) {
                mostrarMateriesEstudiant();
            } else if (opcio == 6) {
                sortir = true;
                System.out.println("Adéu!");
            } else {
                System.out.println("Opció invàlida. Torna a intentar-ho.");
            }
        }
    }
