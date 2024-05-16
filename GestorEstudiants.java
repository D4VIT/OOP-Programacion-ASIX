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

    private static void mostrarMenu() {
        System.out.println("-------- Gestor d'Estudiants --------");
        System.out.println("1. Afegir un nou estudiant");
        System.out.println("2. Afegir una nova matèria a un estudiant");
        System.out.println("3. Eliminar una matèria d'un estudiant");
        System.out.println("4. Mostrar tots els estudiants");
        System.out.println("5. Mostrar les matèries d'un estudiant específic");
        System.out.println("6. Sortir");
        System.out.println("--------------------------------------");
        System.out.print("Selecciona una opció: ");
    }

    private static int obtenerOpcion() {
        return 1;
    }

    private static void afegirEstudiant() {
        System.out.println("Afegir estudiant - Implementación pendiente");
    }

    private static void afegirMateriaEstudiant() {
        System.out.println("Afegir matèria a un estudiant - Implementación pendiente");
    }

    private static void eliminarMateriaEstudiant() {
        System.out.println("Eliminar matèria d'un estudiant - Implementación pendiente");
    }

    
}
